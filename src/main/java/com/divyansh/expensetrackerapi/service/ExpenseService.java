package com.divyansh.expensetrackerapi.service;

import java.util.List;

import com.divyansh.expensetrackerapi.entity.Expense;

public interface ExpenseService {
	List<Expense> getAllExpense();
}
