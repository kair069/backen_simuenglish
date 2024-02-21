package com.example.contactanos.Nivel;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;


import java.util.List;

@Service
public class LevelServiceImpl implements LevelService{

    @Autowired
    private LevelRepository levelRepository;

    @Override
    public List<Level> getAllLevels() {
        return levelRepository.findAll();
    }

    @Override
    public Level getLevelById(Long id) {
        return levelRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Level not found with id: " + id));
    }

    @Override
    public Level createLevel(Level level) {
        return levelRepository.save(level);
    }

    @Override
    public Level updateLevel(Long id, Level level) {
        Level existingLevel = getLevelById(id);
        existingLevel.setName(level.getName());
        existingLevel.setNumber(level.getNumber());
        // Actualiza otros campos según sea necesario
        return levelRepository.save(existingLevel);
    }

    @Override
    public void deleteLevel(Long id) {
        levelRepository.deleteById(id);
    }
}
