package com.rushquimechanix.licenses.repository;

import com.rushquimechanix.model.MgcSistemas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MgcSistemaRepository extends JpaRepository<MgcSistemas, Long> {

}
