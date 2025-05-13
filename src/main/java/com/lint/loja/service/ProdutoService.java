package com.lint.loja.service;

import com.lint.loja.model.Produto;

public interface ProdutoService {
	
	Produto findById(Long id);
	
	Iterable<Produto> findAll();
	
	Produto create(Produto produtoToCreate);
	
	Produto update(Long id, Produto produtoToUpdate);
	
	Produto delete(Long id);

}
