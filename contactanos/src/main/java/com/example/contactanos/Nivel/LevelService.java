package com.example.contactanos.Nivel;

import java.util.List;

public interface LevelService {
    List<Level> getAllLevels();
    Level getLevelById(Long id);
    Level createLevel(Level level);
    Level updateLevel(Long id, Level level);
    void deleteLevel(Long id);
}
