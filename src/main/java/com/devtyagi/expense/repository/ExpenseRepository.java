package com.devtyagi.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devtyagi.expense.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long>{

}
