package com.jphale.discount.sales.service;

import com.jphale.discount.sales.entity.SalesTransaction;
import java.util.List;

public interface ISalesTransactionService {
    SalesTransaction createSalesTransaction(SalesTransaction transaction);
    List<SalesTransaction> getAllSalesTransactions();
}
