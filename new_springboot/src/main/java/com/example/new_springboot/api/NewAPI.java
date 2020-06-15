package com.example.new_springboot.api;

import com.example.new_springboot.dto.NewDTO;
import com.example.new_springboot.entity.NewEntity;
import com.example.new_springboot.service.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin
@RestController
public class NewAPI {

    @Autowired
    private INewService newService;

    @GetMapping(value = "/new")
    public ArrayList<NewEntity> showNew(){
        return null;
    }


    @PostMapping(value = "/new")
    public NewDTO createNew(@RequestBody NewDTO model){
        return newService.save(model);
    }

}
