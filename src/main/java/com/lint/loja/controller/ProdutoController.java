package com.lint.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lint.loja.model.Produto;
import com.lint.loja.service.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@GetMapping("/{id}")
	public ResponseEntity<Produto> findById(@PathVariable Long id) {
		var produto = produtoService.findById(id);
		return ResponseEntity.ok(produto);
	}

}
