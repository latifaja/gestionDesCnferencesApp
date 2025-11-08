package org.example.conferenceservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.conferenceservice.enums.ConfType;
import org.example.conferenceservice.models.Keynote;

import java.time.LocalDateTime;
import java.util.List;
@Entity @AllArgsConstructor @NoArgsConstructor @Builder @Data
public class Conference {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private ConfType confType;
    private Integer durée;
    private Integer nbreInscrits;
    private Integer score;
    private LocalDateTime creationDate;
    @OneToMany(mappedBy = "conf")
    private List<Review> reviews;


     private Long keynoteId;
     @Transient
     private Keynote keynote;

}
