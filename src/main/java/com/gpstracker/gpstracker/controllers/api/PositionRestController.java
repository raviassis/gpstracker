package com.gpstracker.gpstracker.controllers.api;

import com.gpstracker.gpstracker.model.Position;
import com.gpstracker.gpstracker.repository.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(
    value= "api/positions",
    produces = "application/json",
    consumes = "application/json"
)
public class PositionRestController {

    @Autowired
    private PositionRepository positionRepository;

    @PostMapping
    public ResponseEntity post(
        @Valid @RequestBody PositionDto position
    ) {
        System.out.println(position);
        positionRepository.save(position.toEntity());
        return ResponseEntity.ok().build();
    }

    @GetMapping(consumes = { MediaType.ALL_VALUE })
    public ResponseEntity<List<Position>> list() {
        return ResponseEntity.ok(this.positionRepository.findAll());
    }
}
