package at.fhv.librarymanagementsystem.repository;

import at.fhv.librarymanagementsystem.domain.Nutzer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutzerRepository extends JpaRepository<Nutzer, Long> {
}
