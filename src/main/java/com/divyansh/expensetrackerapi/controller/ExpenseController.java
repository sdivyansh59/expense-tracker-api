package com.divyansh.expensetrackerapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.divyansh.expensetrackerapi.entity.Expense;
import com.divyansh.expensetrackerapi.service.ExpenseService;

@RestController
public class ExpenseController {
	
	@Autowired
	private ExpenseService expenseService;
	
	@GetMapping("/expenses")
	public List<Expense> getAllExpense() {
//		return 
		List<Expense>	 tmp = 	expenseService.getAllExpense();
		System.out.println(tmp);
		return tmp;
	}

}
