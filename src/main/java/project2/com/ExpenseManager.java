package project2.com;

import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {

    List<Expense> expenses = new ArrayList<>();

//    public void addExpense(double expense, int id) {
//        if (expenses.get(id) == null) {
//            expenses.add(id,expense);
//            System.out.println("Добавили трату: " + expense);
//        } else {
//            System.out.println("Трата с id " + id + " уже существует");
//        }
//    }
    public void addExpense(Expense expense, int id) {
        if (expenses.get(id) == null) {
            expenses.add(id, expense);
            System.out.println("Добавили трату: " + expense);
        }else {
            System.out.println("Трата с id " + id + " уже существует");
        }
    }

    public void printAllExpenses() {
        System.out.println("Все траты: \n");
        for (Expense expense : expenses) {
            System.out.println(expense);
        }
    }

    public void deleteExpense(int id) {
        if (expenses.get(id) != null) {
            expenses.remove(id);
            System.out.println("Удалили трату по id " + id);
        }else {
            System.out.println("Такой траты нет");
        }
    }

    public void deleteExpense(double expense) {
        for (Expense exp : expenses) {
            if (exp.value == expense) {
                expenses.remove(exp);
                System.out.println("Трата с суммой " + expense + " удалена");
            }else {
                System.out.println("Такой траты нет");
            }
        }
    }
}
