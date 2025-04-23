package com.example.jWTAuth.jwtAuth.controller;

import com.example.jWTAuth.jwtAuth.model.Player;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StatsController {

    private List<Player> players = new ArrayList<>(
            List.of(
                    new Player(1, "test1", "inter", "M", 7222324231L),
                    new Player(2, "test2", "advanced", "M", 7222324231L)
            ));

    @PostMapping("/addPlayer")
    public Player addPlayer(@RequestBody Player student) {
        players.add(student);
        return student;
    }

    @GetMapping("/players")
    public List<Player> getStudents() {
        return players;
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

}
