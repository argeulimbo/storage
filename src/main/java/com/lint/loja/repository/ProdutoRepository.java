package com.lint.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lint.loja.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
