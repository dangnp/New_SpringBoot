package com.example.new_springboot.repository;

import com.example.new_springboot.entity.NewEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewRepository extends JpaRepository<NewEntity, Long> {

}
