package com.example.new_springboot.converter;

import com.example.new_springboot.dto.NewDTO;
import com.example.new_springboot.entity.NewEntity;
import org.springframework.stereotype.Component;

@Component
public class NewConverter {

    public NewEntity toEntity(NewDTO dto) {
        NewEntity entity = new NewEntity();
        entity.setTitle(dto.getTitle());
        entity.setContent(dto.getContent());
        entity.setShortDescription(dto.getShortDescription());
        return entity;
    }

    public NewDTO toDTO(NewEntity entity) {
        NewDTO dto = new NewDTO();
        if (entity.getId() != null) {
            dto.setId(entity.getId());
        }
        dto.setTitle(entity.getTitle());
        dto.setContent(entity.getContent());
        dto.setShortDescription(entity.getShortDescription());
        return dto;
    }
}
