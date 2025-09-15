package at.fhv.librarymanagementsystem.service;

import at.fhv.librarymanagementsystem.repository.ReservierungsRepository;
import org.springframework.stereotype.Service;

@Service
public class ReservierungService {
    private final ReservierungsRepository reservierungsRepository;

    public ReservierungService(ReservierungsRepository reservierungsRepository) {
        this.reservierungsRepository = reservierungsRepository;
    }
}
