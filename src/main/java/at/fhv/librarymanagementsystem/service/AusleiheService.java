package at.fhv.librarymanagementsystem.service;

import at.fhv.librarymanagementsystem.repository.AusleiheRepository;
import org.springframework.stereotype.Service;

@Service
public class AusleiheService {

    private final AusleiheRepository ausleiheRepository;

    public AusleiheService(AusleiheRepository ausleiheRepository) {
        this.ausleiheRepository = ausleiheRepository;
    }
}
