package com.lint.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lint.loja.model.Pedido;
import com.lint.loja.service.PedidoService;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {
	
	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Pedido> findById(@PathVariable Long id){
		var pedido = pedidoService.findById(id);		
		return ResponseEntity.ok(pedido);
	}
	

}
