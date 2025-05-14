package com.lint.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lint.loja.model.Fornecedor;
import com.lint.loja.service.FornecedorService;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {
	
	@Autowired
	private FornecedorService fornecedorService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Fornecedor> findById(@PathVariable Long id){
		var fornecedor = fornecedorService.findById(id);
		return ResponseEntity.ok(fornecedor);	
	}

}
