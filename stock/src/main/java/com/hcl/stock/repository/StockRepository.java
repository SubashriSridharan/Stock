package com.hcl.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.stock.entity.Stock;

public interface StockRepository extends JpaRepository<Stock, Long> {

}
