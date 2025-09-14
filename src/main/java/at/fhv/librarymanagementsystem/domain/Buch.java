package at.fhv.librarymanagementsystem.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Buch {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String titel;
    private String beschreibung;
    @Column(nullable = false, unique = true, updatable = false)
    private String isbn;
    @Column(nullable = false)
    private String veroeffentlichungsdatum;
    @Column(nullable = false)
    private String verlag;
    @Column(nullable = false)
    private String autor;
    @Column(nullable = false)
    private String kategorie;

}
