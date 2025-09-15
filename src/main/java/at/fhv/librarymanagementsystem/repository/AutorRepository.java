package at.fhv.librarymanagementsystem.repository;

import at.fhv.librarymanagementsystem.domain.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
}
