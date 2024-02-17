package com.compea.greetings.greetingsbe.controller;

import com.compea.greetings.greetingsbe.api.DefaultApi;
import com.compea.greetings.greetingsbe.model.World;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class ApiController implements DefaultApi {

    @Override
    public ResponseEntity<World> greetingGet() throws Exception {
        World body = new World();
        body.setCondition("Habitable");
        body.setAge(4500000000L);
        body.setComposition("Rocky");
        body.setDate(LocalDate.now());
        return ResponseEntity.ok(body);
    }
}


