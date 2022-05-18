package com.divyansh.expensetrackerapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divyansh.expensetrackerapi.entity.Expense;
import com.divyansh.expensetrackerapi.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepo;
	
	@Override
	public List<Expense> getAllExpense() {
		// TODO Auto-generated method stub
		return expenseRepo.findAll();
	}

}
