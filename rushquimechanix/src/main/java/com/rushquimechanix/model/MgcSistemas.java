package com.rushquimechanix.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="mgc_sistemas")
public class MgcSistemas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_sistema")
    private Long idSistema;

    private String nombre;
    

    public Long getIdSistema() {
        return idSistema;
    }

    public void setIdSistema(Long idSistema) {
        this.idSistema = idSistema;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
