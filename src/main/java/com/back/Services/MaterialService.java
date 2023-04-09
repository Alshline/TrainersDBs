package com.back.Services;

import com.back.Entities.MaterialEntity;
import com.back.Interfaces.MaterialServiceInterface;
import com.back.Repositories.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService implements MaterialServiceInterface {

    @Autowired
    private MaterialRepository materialRepository;

    @Override
    public List<MaterialEntity> getAllMaterials() {
        return materialRepository.findAll();
    }
}
