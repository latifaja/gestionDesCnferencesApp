package org.example.conferenceservice;

import org.example.conferenceservice.entities.Conference;
import org.example.conferenceservice.entities.Review;
import org.example.conferenceservice.enums.ConfType;
import org.example.conferenceservice.repositories.ConfRepo;
import org.example.conferenceservice.repositories.ReviewRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class ConferenceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConferenceServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ReviewRepo reviewRepo, ConfRepo confRepo) {
        return args -> {



               confRepo.save(
                       Conference.builder()
                               .durée(2)
                               .score(3)
                               .titre("TTTT")
                               .confType(ConfType.ACADEMIQUE)
                               .creationDate(LocalDateTime.now())
                               .build()
                       );
            confRepo.findAll().forEach(
                    conf->{
                        Review review = Review.builder()
                                .texte("aaaa")
                                .note(1.0)
                                .date(LocalDateTime.now())
                                .conf(conf)
                                .build();
                        reviewRepo.save(review);
                    }
            );


        };

    }
}
