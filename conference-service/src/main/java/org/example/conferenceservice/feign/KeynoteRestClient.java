package org.example.conferenceservice.feign;

import org.example.conferenceservice.models.Keynote;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@FeignClient(name = "keynote-service")
public interface KeynoteRestClient {
    @GetMapping("/api/keynotes/{keynoteId}")
    Keynote findKeynoteById(@PathVariable Long keynoteId );

    @GetMapping("/api/keynotes")
    PagedModel<Keynote> findAllKeynotes();
}
