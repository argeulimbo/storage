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
	public Iterable<Produto> findAll() {
		return produtoRepository.findAll();
	}
	
	@Override
	public Produto findById(Long id) {
		return produtoRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}
	
	@Override
	public Produto create(Produto produtoToCreate) {
		if (produtoToCreate.getId() != null && produtoRepository.existsById(produtoToCreate.getId())) {
			throw new IllegalArgumentException(String.format("Erro: Já existe o ID %d criado!", produtoToCreate.getId()));
		}
		else {
			return produtoRepository.save(produtoToCreate);
		}
	}

	@Override
	public Produto update(Long id, Produto produtoToUpdate) {
		if (id == null && !produtoRepository.existsById(produtoToUpdate.getId())) {
			throw new IllegalArgumentException(String.format("Erro: não foi possível encontar o ID %d especificado!", id));
		}
		else {
			return produtoRepository.save(produtoToUpdate);
		}
	}

	@Override
	public Produto delete(Long id) {
		if (id == null && !produtoRepository.existsById(id)) {
			throw new IllegalArgumentException(String.format("Erro: não foi possível encontrar o ID %d especificado para deletar!", id));
		}
		else {
			Produto produto = produtoRepository.findById(id).orElse(null);
			produtoRepository.deleteById(id);
			return produto;
		}
	}

}
