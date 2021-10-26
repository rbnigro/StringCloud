package com.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.model.Usuario;

@Repository
public interface UsurioRepo extends JpaRepository<Usuario, Long>
 {

}
