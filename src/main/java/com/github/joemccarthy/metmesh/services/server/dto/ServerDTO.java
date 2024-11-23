package com.github.joemccarthy.metmesh.services.server.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServerDTO {

    @Schema(name = "name", description = "Friendly name for the server currently in use.", example = "my-weather-metmesh")
    private String name;
}
