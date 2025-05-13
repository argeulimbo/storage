package com.lint.loja.service.impl;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;

import com.lint.loja.model.Produto;
import com.lint.loja.repository.ProdutoRepository;
import com.lint.loja.service.ProdutoService;

public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Override
	public Produto findById(Long id) {
		return produtoRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}
	
	@Override
	public Produto create(Produto produtoToCreate) {
		if (produtoToCreate.getId() != null && produtoRepository.existsById(produtoToCreate.getId())) {
			throw new IllegalArgumentException("O produto ID " + produtoToCreate.getId() + " já existe criado!");
		}
		else {
			return produtoRepository.save(produtoToCreate);
		}
	}

	@Override
	public Iterable<Produto> findAll() {
		return produtoRepository.findAll();
	}

	@Override
	public Produto update(Long id, Produto produtoToUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
