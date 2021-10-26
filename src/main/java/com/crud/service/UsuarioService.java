package com.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Usuario;
import com.crud.repo.UsurioRepo;

@Service
public class UsuarioService {

	@Autowired
	UsurioRepo userRepo;
	
	public List<Usuario> getAll() {
		return userRepo.findAll();
	}
	
	public Optional<Usuario> getById(long id) {
		return userRepo.findById(id);
	}
}
