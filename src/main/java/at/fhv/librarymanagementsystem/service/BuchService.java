package at.fhv.librarymanagementsystem.service;

import at.fhv.librarymanagementsystem.repository.BuchRepository;
import org.springframework.stereotype.Service;

@Service
public class BuchService {
    private final BuchRepository buchRepository;

    public BuchService(BuchRepository buchRepository) {
        this.buchRepository = buchRepository;
    }
}
