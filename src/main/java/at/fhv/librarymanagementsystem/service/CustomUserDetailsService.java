package at.fhv.librarymanagementsystem.service;

import at.fhv.librarymanagementsystem.repository.AdminRepository;
import at.fhv.librarymanagementsystem.repository.AutorRepository;
import at.fhv.librarymanagementsystem.repository.NutzerRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final AdminRepository adminRepo;
    private final AutorRepository autorRepo;
    private final NutzerRepository nutzerRepo;

    public CustomUserDetailsService(AdminRepository adminRepo, AutorRepository autorRepo, NutzerRepository nutzerRepo) {
        this.adminRepo = adminRepo;
        this.autorRepo = autorRepo;
        this.nutzerRepo = nutzerRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return adminRepo.findByUsername(username)
                .map(admin -> User.builder()
                        .username(admin.getUsername())
                        .password(admin.getPassword())
                        .roles("ADMIN")
                        .build())
                .orElseGet(() -> autorRepo.findByUsername(username)
                        .map(autor -> User.builder()
                                .username(autor.getUsername())
                                .password(autor.getPassword())
                                .roles("AUTOR")
                                .build())
                        .orElseGet(() -> nutzerRepo.findByUsername(username)
                                .map(nutzer -> User.builder()
                                        .username(nutzer.getUsername())
                                        .password(nutzer.getPassword())
                                        .roles("NUTZER")
                                        .build())
                                .orElseThrow(() -> new UsernameNotFoundException("User nicht gefunden: " + username))
                        )
                );
    }
}
