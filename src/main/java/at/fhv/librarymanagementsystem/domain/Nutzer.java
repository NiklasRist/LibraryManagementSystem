package at.fhv.librarymanagementsystem.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Nutzer {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String vorname;
    @Column(nullable = false)
    private String nachname;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String passwort;

    @OneToMany(mappedBy = "nutzer")
    private List<Reservierung> reservierungen;
    @OneToMany(mappedBy = "nutzer")
    private List<Ausleihe> ausleihen;
    @OneToMany(mappedBy = "nutzer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SpaeterLesen> spaeterLesen;
    }
