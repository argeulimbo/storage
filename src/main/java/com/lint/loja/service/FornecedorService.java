package com.lint.loja.service;

import com.lint.loja.model.Fornecedor;

public interface FornecedorService {
	
	Fornecedor findById(Long id);
	
	Fornecedor create(Fornecedor fornecedorToCreate);
	
	
}
