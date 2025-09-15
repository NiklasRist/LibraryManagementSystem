package at.fhv.librarymanagementsystem.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Entity
@Data
public class Buch {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String titel;
    private String beschreibung;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    @CollectionTable(
            name = "buch_kategorien",
            joinColumns = @JoinColumn(name = "buch_id"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"buch_id", "kategorie"}))
    @Column(nullable = false)
    private Set<Kategorie> kategorie;
    @Column(nullable = false)
    private boolean verfuegbarkeit;

    @OneToMany(mappedBy = "buch", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ausleihe> ausleihen;
    @OneToMany(mappedBy = "buch", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Reservierung> reservierungen;
    @OneToMany(mappedBy = "buch", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SpaeterLesen> spaeterLesen;

    @OneToMany(mappedBy = "buch", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Veroeffentlichung> veroeffentlichungen;

}
