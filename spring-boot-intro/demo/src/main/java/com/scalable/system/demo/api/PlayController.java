package com.scalable.system.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/players")
public class PlayController {

    @GetMapping
    public ResponseEntity<String> getAllPlayers() {
        return ResponseEntity.ok("All players");
    }
}
