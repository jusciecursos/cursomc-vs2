package com.juscie.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juscie.cursomc.domain.Categoria;
import com.juscie.cursomc.repositories.CategoriaRepository;
import com.juscie.cursomc.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		
		Optional<Categoria> obj = repo.findById(id);
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não econtrado! Id: " + id + ", tipo " + Categoria.class.getName()));

	}

}
