package org.example.mcpsevice.tools;

import org.example.mcpsevice.feign.KeynoteRestClient;
import org.example.mcpsevice.models.Keynote;
import org.springaicommunity.mcp.annotation.McpTool;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.hateoas.PagedModel;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
@EnableFeignClients
public class McpTools {
    KeynoteRestClient keynoteRestClient;

    public McpTools(KeynoteRestClient keynoteRestClient) {
        this.keynoteRestClient = keynoteRestClient;
    }

    @McpTool(description = "Get All Keynotes")
    public List<String> getAllKeynotes() {
        PagedModel<Keynote> model = keynoteRestClient.getAllKeynotes();

        if (model == null || model.getContent() == null) {
            return List.of("Aucun keynote trouvé.");
        }
        System.out.println(model.getContent().stream()
                .map(Keynote::toString)  // UTILISE toString()
                .collect(Collectors.toList()));
        return model.getContent().stream()
                .map(Keynote::toString)  // UTILISE toString()
                .collect(Collectors.toList());
    }
}
