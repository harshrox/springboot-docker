package com.harshrox.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerController {

    @GetMapping("/{user}")
    public String greet(@PathVariable String user){
        return "Hello " + user;
    }
}
