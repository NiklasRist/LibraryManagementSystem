package at.fhv.librarymanagementsystem.repository;

import at.fhv.librarymanagementsystem.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
