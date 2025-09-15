package at.fhv.librarymanagementsystem.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Veroeffentlichung {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Autor autor;
    @ManyToOne
    private Buch buch;
    @Column(nullable = false)
    private LocalDateTime veroeffentlichungsdatum;
    @Column(nullable = false)
    private String verlag;
    @Column(nullable = false, unique = true, updatable = false)
    private String isbn;
}
