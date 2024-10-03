package com.github.joemccarthy.metmesh.services.server;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.joemccarthy.metmesh.services.server.delegate.ServerDelegate;
import com.github.joemccarthy.metmesh.services.server.dto.ServerDTO;


import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor
public class ServerRestController {
    
    private final ServerDelegate serverDelegate;

    @GetMapping(path = "/api/v1/server")
    public ResponseEntity<ServerDTO> getMethodName() {
        return ResponseEntity.ok(ServerDTO.builder().name(serverDelegate.getMethodName()).build());
    }
    
}
