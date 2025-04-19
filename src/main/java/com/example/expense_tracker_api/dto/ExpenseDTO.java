package com.example.expense_tracker_api.dto;

import lombok.Data;

import java.time.LocalDate;

@Data

public class ExpenseDTO {
    private String title;
    private String category;
    private Double amount;
    private LocalDate date;
}
