package org.example.conferenceservice.repositories;

import org.example.conferenceservice.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource

public interface ReviewRepo extends JpaRepository<Review, Long> {
}
