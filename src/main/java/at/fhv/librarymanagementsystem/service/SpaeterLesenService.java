package at.fhv.librarymanagementsystem.service;

import at.fhv.librarymanagementsystem.repository.SpaeterLesenRepository;
import org.springframework.stereotype.Service;

@Service
public class SpaeterLesenService {
    private final SpaeterLesenRepository spaeterLesenRepository;

    public SpaeterLesenService(SpaeterLesenRepository spaeterLesenRepository) {
        this.spaeterLesenRepository = spaeterLesenRepository;
    }
}
