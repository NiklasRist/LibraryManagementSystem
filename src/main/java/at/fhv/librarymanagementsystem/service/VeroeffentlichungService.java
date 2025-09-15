package at.fhv.librarymanagementsystem.service;

import at.fhv.librarymanagementsystem.repository.VeroeffentlichungsRepository;
import org.springframework.stereotype.Service;

@Service
public class VeroeffentlichungService {
    private final VeroeffentlichungsRepository veroeffentlichungsRepository;

    public VeroeffentlichungService(VeroeffentlichungsRepository veroeffentlichungsRepository) {
        this.veroeffentlichungsRepository = veroeffentlichungsRepository;
    }
}
