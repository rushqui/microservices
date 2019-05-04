package com.rushquimechanix.licenses.services;

import com.rushquimechanix.licenses.repository.MgcSistemaRepository;
import com.rushquimechanix.model.MgcSistemas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MgcSistemaService {

    @Autowired
    private MgcSistemaRepository mgcSistemaRepository;

    public List<MgcSistemas> getAllSystems(){
        return mgcSistemaRepository.findAll();
    }
}
