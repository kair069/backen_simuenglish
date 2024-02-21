package com.example.contactanos.Nivel;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/levels")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class LevelController {
    @Autowired
    private LevelService levelService;

    @GetMapping
    public ResponseEntity<List<Level>> getAllLevels() {
        List<Level> levels = levelService.getAllLevels();
        return new ResponseEntity<>(levels, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Level> getLevelById(@PathVariable("id") Long id) {
        Level level = levelService.getLevelById(id);
        return new ResponseEntity<>(level, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Level> createLevel(@RequestBody Level level) {
        Level createdLevel = levelService.createLevel(level);
        return new ResponseEntity<>(createdLevel, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Level> updateLevel(@PathVariable("id") Long id, @RequestBody Level level) {
        Level updatedLevel = levelService.updateLevel(id, level);
        return new ResponseEntity<>(updatedLevel, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteLevel(@PathVariable("id") Long id) {
        levelService.deleteLevel(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
