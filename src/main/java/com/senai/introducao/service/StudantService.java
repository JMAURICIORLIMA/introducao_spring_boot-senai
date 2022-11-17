package com.senai.introducao.service;

import com.senai.introducao.domain.Studant;
import com.senai.introducao.repository.StudantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudantService {

    @Autowired
    StudantRepository studantRepository;

    public List<Studant> studantList(){
        return studantRepository.findAll();
    }

    public Studant studantAdd(Studant studant){
        return studantRepository.save(studant);
    }
}
