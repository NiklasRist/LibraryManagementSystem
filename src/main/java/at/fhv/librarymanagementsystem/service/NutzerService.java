package at.fhv.librarymanagementsystem.service;

import at.fhv.librarymanagementsystem.repository.NutzerRepository;
import org.springframework.stereotype.Service;

@Service
public class NutzerService {
    private final NutzerRepository nutzerRepository;


    public NutzerService(NutzerRepository nutzerRepository) {
        this.nutzerRepository = nutzerRepository;
    }
}
