package at.fhv.librarymanagementsystem.service;

import at.fhv.librarymanagementsystem.repository.AdminRepository;
import at.fhv.librarymanagementsystem.repository.AutorRepository;
import at.fhv.librarymanagementsystem.repository.NutzerRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import at.fhv.librarymanagementsystem.domain.Admin;


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
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return adminRepo.findByEmail(email)
                .map(admin -> User.builder()
                        .username(admin.getEmail())
                        .password(admin.getPasswort())
                        .roles("ADMIN") //--> intern ROLE_ADMIN :)
                        .build())
                .orElseGet(() -> autorRepo.findByEmail(email)
                        .map(autor -> User.builder()
                                .username(autor.getEmail())
                                .password(autor.getPasswort())
                                .roles("AUTOR")
                                .build())
                        .orElseGet(() -> nutzerRepo.findByEmail(email)
                                .map(nutzer -> User.builder()
                                        .username(nutzer.getEmail())
                                        .password(nutzer.getPasswort())
                                        .roles("NUTZER")
                                        .build())
                                .orElseThrow(() -> new UsernameNotFoundException("User nicht gefunden: " + email))
                        )
                );
    }
}
