package com.rushquimechanix.licenses.cotrollers;

import com.rushquimechanix.licenses.services.MgcSistemaService;
import com.rushquimechanix.model.MgcSistemas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/v1/sistemas")
public class MgcSistemaServiceController {

    @Autowired
    private MgcSistemaService mgcSistemaService;

    @RequestMapping(value="",method = RequestMethod.GET)
    public List<MgcSistemas> getSystems() {
        return mgcSistemaService.getAllSystems();
    }

}
