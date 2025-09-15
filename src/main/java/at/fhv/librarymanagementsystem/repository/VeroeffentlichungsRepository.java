package at.fhv.librarymanagementsystem.repository;

import at.fhv.librarymanagementsystem.domain.Veroeffentlichung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeroeffentlichungsRepository extends JpaRepository<Veroeffentlichung,Long> {
}
