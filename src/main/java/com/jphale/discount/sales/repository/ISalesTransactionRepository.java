package com.jphale.discount.sales.repository;

import com.jphale.discount.sales.entity.SalesTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISalesTransactionRepository extends JpaRepository<SalesTransaction, String> {
}
