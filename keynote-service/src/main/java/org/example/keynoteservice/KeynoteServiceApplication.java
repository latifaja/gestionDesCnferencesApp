package org.example.keynoteservice;


import org.example.keynoteservice.entities.Keynote;
import org.example.keynoteservice.repositories.KeynoteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class KeynoteServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeynoteServiceApplication.class, args);
    }
     @Bean
    CommandLineRunner commandLineRunner(KeynoteRepository keynoteRepository) {
        return args -> {
            for (int i=0;i<5;i++){
                Keynote keynote = Keynote.builder()
                        .id(UUID.randomUUID().toString())
                        .email("aaaaaaaa"+i+"@gmail.com")
                        .nom("aaa"+i)
                        .prenom("aaaa"+i)
                        .fonction("aaaaa"+i)
                        .build();
                keynoteRepository.save(keynote);
            }
        };

     }

}
