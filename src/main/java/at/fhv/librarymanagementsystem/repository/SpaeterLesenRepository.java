package at.fhv.librarymanagementsystem.repository;

import at.fhv.librarymanagementsystem.domain.SpaeterLesen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpaeterLesenRepository extends JpaRepository<SpaeterLesen,Long> {
}
