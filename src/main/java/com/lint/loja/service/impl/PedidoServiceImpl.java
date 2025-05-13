package com.lint.loja.service.impl;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;

import com.lint.loja.model.Pedido;
import com.lint.loja.repository.PedidoRepository;
import com.lint.loja.service.PedidoService;

public class PedidoServiceImpl implements PedidoService {
	
	@Autowired
	private PedidoRepository pedidoRepository;

	@Override
	public Pedido findById(Long id) {
		return pedidoRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public Pedido create(Pedido pedidoToCreate) {
		if (pedidoToCreate.getId() != null && pedidoRepository.existsById(pedidoToCreate.getId())) {
			throw new IllegalArgumentException("O pedido do ID " + pedidoToCreate.getId() + " já existe!");
		}
		else {
			return pedidoRepository.save(pedidoToCreate);
		}
	}

	@Override
	public Iterable<Pedido> findAll() {
		return pedidoRepository.findAll();
	}

	@Override
	public Pedido update(Long id, Pedido pedidoToUpdate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedido delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
