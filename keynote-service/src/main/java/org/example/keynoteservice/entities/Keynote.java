package org.example.keynoteservice.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
@Entity
public class Keynote {
    @Id
    private String id;
    private String nom;
    private String prenom;
    private String email;
    private String fonction;



}
