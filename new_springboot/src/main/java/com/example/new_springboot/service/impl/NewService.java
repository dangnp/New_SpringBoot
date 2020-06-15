package com.example.new_springboot.service.impl;

import com.example.new_springboot.converter.NewConverter;
import com.example.new_springboot.dto.NewDTO;
import com.example.new_springboot.entity.CategoryEntity;
import com.example.new_springboot.entity.NewEntity;
import com.example.new_springboot.repository.CategoryRepository;
import com.example.new_springboot.repository.NewRepository;
import com.example.new_springboot.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewService implements INewService {

    @Autowired
    private NewRepository newRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private NewConverter newConverter;

    @Override
    public NewDTO save(NewDTO newDTO) {
        CategoryEntity categoryEntity = categoryRepository.findOneByCode(newDTO.getCategoryCode());
        NewEntity newEntity = newConverter.toEntity(newDTO);
        newEntity.setCategory(categoryEntity);
        newEntity = newRepository.save(newEntity);
        return newConverter.toDTO(newEntity);
    }
}
