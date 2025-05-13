package com.lint.loja.service;

import com.lint.loja.model.Fornecedor;

public interface FornecedorService {
	
	Fornecedor findById(Long id);
	
	Iterable<Fornecedor>findAll();
	
	Fornecedor create(Fornecedor fornecedorToCreate);
	
	Fornecedor update(Long id, Fornecedor fornecedorToUpdate);
	
	Fornecedor delete(Long id);
	
	
}
