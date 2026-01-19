package com.example.numbervalidator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class NumberController {

    @GetMapping("/validate/{number}")
    public Map<String, Object> validateNumber(@PathVariable int number) {
        Map<String, Object> response = new HashMap<>();
        response.put("number", number);
        
        if (number % 2 == 0) {
            response.put("result", "even");
        } else {
            response.put("result", "odd");
        }
        
        return response;
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "UP");
        response.put("message", "Number Validator API is running");
        return response;
    }
}