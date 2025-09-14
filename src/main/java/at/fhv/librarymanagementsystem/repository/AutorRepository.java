package at.fhv.librarymanagementsystem.repository;

import at.fhv.librarymanagementsystem.domain.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository<Autor, Long> {
}
