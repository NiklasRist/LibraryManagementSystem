package at.fhv.librarymanagementsystem.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class Ausleihe {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Buch buch;
    @ManyToOne
    private Nutzer nutzer;
    private LocalDateTime Rueckgabe; // wird benötigt für verfügbarkeit bei reservierung
}
