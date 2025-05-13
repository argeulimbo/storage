package com.lint.loja.service.impl;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;

import com.lint.loja.model.Fornecedor;
import com.lint.loja.repository.FornecedorRepository;
import com.lint.loja.service.FornecedorService;

public class FornecedorServiceImpl implements FornecedorService {
	
	@Autowired
	private FornecedorRepository fornecedorRepository;

	@Override
	public Fornecedor findById(Long id) {		
		return fornecedorRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public Fornecedor create(Fornecedor fornecedorToCreate) {
		if (fornecedorToCreate.getId() != null && fornecedorRepository.existsById(fornecedorToCreate.getId())) {
			throw new IllegalArgumentException("Erro: Já existe ID para este fornecedor | ID: " + fornecedorToCreate.getId());
		}
		else {
			return fornecedorRepository.save(fornecedorToCreate);
		}		
	}

	@Override
	public Iterable<Fornecedor> findAll() {
		return fornecedorRepository.findAll();
	}

	@Override
	public Fornecedor update(Long id, Fornecedor fornecedorToUpdate) {
		return null;
	}

	@Override
	public Fornecedor delete(Long id) {
		if (id == null && !fornecedorRepository.existsById(id)) {
			throw new IllegalArgumentException("Erro: Não foi possível encontrar o id fornecido para exclusão! ID: " + id);
		} 
		else {
			Fornecedor fornecedor = fornecedorRepository.findById(id).orElse(null);
			fornecedorRepository.deleteById(id);
			return fornecedor;			
		}
		
	}	
	
	
	
}
