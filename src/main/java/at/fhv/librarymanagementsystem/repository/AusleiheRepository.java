package at.fhv.librarymanagementsystem.repository;

import at.fhv.librarymanagementsystem.domain.Ausleihe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AusleiheRepository extends JpaRepository<Ausleihe,Long> {
}
