package com.senai.introducao.controller;

import com.senai.introducao.domain.Studant;
import com.senai.introducao.service.StudantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/studant")
public class StudantController {

    @Autowired
    private StudantService studantService;

    @GetMapping
    public List<Studant> allStudants(){
        return studantService.studantList();
    }

    @PostMapping
    public
}
