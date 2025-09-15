package at.fhv.librarymanagementsystem.repository;

import at.fhv.librarymanagementsystem.domain.Reservierung;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservierungsRepository extends JpaRepository<Reservierung,Long> {
}
