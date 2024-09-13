package com.example.expensetracker.Service;

import com.example.expensetracker.Model.Expense;
import com.example.expensetracker.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expense>getAllExpense(){
        return expenseRepository.findAll();
    }

    public void saveExpense(Expense expense){
        expenseRepository.save(expense);
    }

    public Expense getExpenseByID(Long id){
        return expenseRepository.findById(id).orElse(null);
    }

    public void deleteExpense(Long id){
        expenseRepository.deleteById(id);
    }
}
