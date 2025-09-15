package at.fhv.librarymanagementsystem.repository;

import at.fhv.librarymanagementsystem.domain.Buch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuchRepository extends JpaRepository<Buch, Long> {
}
