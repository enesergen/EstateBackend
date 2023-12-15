package com.realestate.project;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/api/v1/estate")
public class EstateController {

    private final EstateService service;

    public EstateController(EstateService service) {
        this.service = service;
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Estate>> getAllEstate() {
        return ResponseEntity.ok(service.getAllEstate());
    }

    @PostMapping("/add-estate")
    public ResponseEntity<Boolean> addEstate(@RequestBody Estate estate) throws Exception {
        return ResponseEntity.ok(service.addEstate(estate));
    }

    @DeleteMapping("/delete-estate/{id}")
    public ResponseEntity<Boolean> deleteEstate(@PathVariable int id) throws Exception {
        return ResponseEntity.ok(service.deleteEstate(id));
    }

    @PutMapping("/update-estate")
    public ResponseEntity<Boolean> updateEstate(@RequestBody Estate estate) throws Exception {
        return ResponseEntity.ok(service.updateEstate(estate));
    }


}
