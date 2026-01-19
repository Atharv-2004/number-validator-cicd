package com.example.numbervalidator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(NumberController.class)
public class NumberControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testEvenNumber() throws Exception {
        mockMvc.perform(get("/validate/4"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.number").value(4))
                .andExpect(jsonPath("$.result").value("even"));
    }

    @Test
    public void testOddNumber() throws Exception {
        mockMvc.perform(get("/validate/5"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.number").value(5))
                .andExpect(jsonPath("$.result").value("odd"));
    }

    @Test
    public void testHealthEndpoint() throws Exception {
        mockMvc.perform(get("/health"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.status").value("UP"));
    }
}