package com.test.fizzbuzz.rest.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.fizzbuzz.FizzBuzzCalc;
import com.test.fizzbuzz.beans.JSONNumberBean;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/fizzbuzz")
public class FizzBuzzController {

    @PostMapping(path= "", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public String fizzBuzz (@RequestBody JSONNumberBean number) {
        List<String> objects =  FizzBuzzCalc.generateFizzBuzz(number.getNumber());
        ObjectMapper mapper = new ObjectMapper();
        String json = "";

        try {
            json = mapper.writeValueAsString(objects);
            return "{" + json + "}";
        } catch (JsonProcessingException jpe) {
            System.out.println("Failed to parse JSON: " + jpe.getMessage());
            jpe.printStackTrace();
        }

        return null;
    }
}
