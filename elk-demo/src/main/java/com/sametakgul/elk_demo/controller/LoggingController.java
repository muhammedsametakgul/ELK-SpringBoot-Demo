package com.sametakgul.elk_demo.controller;

import com.sametakgul.elk_demo.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class LoggingController {

    private static final Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @GetMapping("/log")
    public String logMessage() {
        logger.info("This is an info log message");
        logger.warn("This is a warning log message");
        logger.error("This is an error log message");
        return "Check the logs!";
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        List<User> users = Arrays.asList(
                new User("Samet", 30, "Turkey"),
                new User("Muhammed", 25, "Turkey"),
                new User("Fatih", 35, "Turkey")
        );

        users.forEach(user -> logger.info("User: {} from {}", user.getName(), user.getCountry()));

        return users;
    }
}
