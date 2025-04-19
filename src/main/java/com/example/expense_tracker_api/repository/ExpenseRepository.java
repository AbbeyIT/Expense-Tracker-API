package com.example.expense_tracker_api.repository;

import com.example.expense_tracker_api.model.Expense;
import com.example.expense_tracker_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    List<Expense> findByUserAndDateBetween(User user, LocalDate start, LocalDate end);
    List<Expense> findByUser(User user);
}
