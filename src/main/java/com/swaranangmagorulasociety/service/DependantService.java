package com.swaranangmagorulasociety.service;

import com.swaranangmagorulasociety.model.Dependant;
import com.swaranangmagorulasociety.repository.DependantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DependantService {

    @Autowired
    private DependantRepository dependantRepository;

    public DependantService(DependantRepository dependantRepository) {
        this.dependantRepository = dependantRepository;
    }

    public Dependant addDependant(Dependant dependant){
        return dependantRepository.save(dependant);
    }

    public List<Dependant> getAllDependants(){
        return dependantRepository.findAll();
    }

}
