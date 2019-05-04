package com.rushquimechanix.licenses.cotrollers;

import com.rushquimechanix.licenses.services.MgcSistemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/v1/sistemas")
public class MgcSistemaServiceController {

    @Autowired
    private MgcSistemaService mgcSistemaService;


}
