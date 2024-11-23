package com.github.joemccarthy.metmesh.services.server;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.joemccarthy.metmesh.services.server.delegate.ServerDelegate;
import com.github.joemccarthy.metmesh.services.server.dto.ServerDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@Tag(name = "Server", description = "Something about the endpoint group here.")
public class ServerRestController {

    private final ServerDelegate serverDelegate;

    @GetMapping(path = "/api/v1/server")
    @Operation(summary = "Get Server Name", description = "Something about this endpoint.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ServerDTO.class))),
            @ApiResponse(responseCode = "404", description = "Not found - The server was not found" , content = @Content())
    })
    public ResponseEntity<ServerDTO> getMethodName() {
        return ResponseEntity.ok(ServerDTO.builder().name(serverDelegate.getMethodName()).build());
    }

}
