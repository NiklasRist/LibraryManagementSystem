package at.fhv.librarymanagementsystem.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Autor {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String vorname;
    @Column(nullable = false)
    private String nachname;
    @Column(nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "autor")
    private List<Veroeffentlichung> veroeffentlichungen;

}
