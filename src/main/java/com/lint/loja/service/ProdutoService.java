package com.lint.loja.service;

import com.lint.loja.model.Produto;

public interface ProdutoService {
	
	Produto findById(Long id);
	
	Produto create(Produto produto);

}
