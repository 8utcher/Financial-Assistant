package project2.com;

import java.util.ArrayList;
import java.util.List;

public class ExpenseManager {

    List<Expense> expenses = new ArrayList<>();

  public void addExpense(int id, Expense expense) {
        if (expenses.get(id) == null) {
            expenses.add(id,expense);
            System.out.println("Добавили трату: " + expense);
           System.out.println("Трата с id " + id + " уже существует");
       }
   }


//    public void addExpense(double value, int id, String description) {
//        if (id < expenses.size()) {
//            expenses.add(id, new Expense(value, description));
//            System.out.println("Добавили по индексу " + id + ": " + new Expense(value, description));
//        }else {
//            System.out.println("Ошибка: индекс " + id + " превышает текущий размер списка");
//        }
//    }

//    public void addExpense(double expense, String description) {
//       Expense exp = new Expense(expense, description);
//       expenses.add(exp);
//        System.out.println("Добавили трату: " + expense);
//    }
//    public List<Expense> getExpenses() {
//        return expenses;
//    }


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
