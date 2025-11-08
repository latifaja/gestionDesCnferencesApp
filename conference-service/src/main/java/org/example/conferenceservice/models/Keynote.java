package org.example.conferenceservice.models;

import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.example.conferenceservice.entities.Conference;

import java.util.List;

@Getter @Setter
public class Keynote {
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String fonction;



}

