package ru.netology.stats;

public class VacationPlanner {
    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int vacationMonths = 0; // счетчик месяцев отдыха
        int savings = 0; // количество денег на счету

        for (int month = 0; month < 12; month++) {
            if (savings >= threshold) { // можем ли отдыхать?
                vacationMonths++; // увеличиваем счетчик месяцев отдыха
                int vacationExpenses = expenses * 3;
                savings = savings - vacationExpenses;
            } else {
                savings = savings + income - expenses;
            }
        }

        return vacationMonths;
    }
}
