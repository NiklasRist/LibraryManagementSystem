package at.fhv.librarymanagementsystem.repository;

import at.fhv.librarymanagementsystem.domain.Nutzer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NutzerRepository extends JpaRepository<Nutzer, Long> {
}
