package project2.com;

import java.util.*;

public class ExpenseManager {

    Map<String, List<Expense>> expenses = new HashMap<>();

    public void addExpense(Expense expense, String category) {

        if (expenses.containsKey(category)) {
            List<Expense> exp = expenses.get(category);
            if (!exp.contains(expense)) {
                exp.add(expense);
            } else {
                System.out.println("Трата с таким id " + expense.getId() + " уже существует");
            }
            System.out.println("Добавили трату в категорию " + category + " с id: " + expense.getId() + ", " + expense);
        } else {
            List<Expense> list = new ArrayList<>();
            list.add(expense);
            expenses.put(category, list);
            System.out.println("Добавили трату в категорию " + category + " с id: " + expense.getId() + ", " + expense);
        }
    }

    public void printAllExpenses() {
        System.out.println("Все траты: \n");
        for (Map.Entry<String, List<Expense>> entry : expenses.entrySet()) { // Set < Map.Entry<String, List<Expense>>>
            System.out.println(entry.getKey() + " : \n");
            List<Expense> list = entry.getValue();
            for (Expense expense : list) {
                System.out.println(expense);
            }
        }
    }

    public void printAllExpensesByCategory(String category) {
        if (expenses.containsKey(category)) {
            System.out.println("Все траты в категории " + category);
            List<Expense> list = expenses.get(category);
            for (Expense expense : list) {
                System.out.println(expense);
            }
        } else {
            System.out.println("Такой категории нет");
        }
    }

    public void deleteExpense(int id, String category) {
        boolean removed = false;

        if (expenses.containsKey(category)) {
            List<Expense> list = expenses.get(category);

            Iterator<Expense> iterator = list.iterator();
            while (iterator.hasNext()) {
                Expense expense = iterator.next();
                if (expense.getId() == id) {
                    iterator.remove();
                    System.out.println("Трата с таким айди id " + id + " удалена");
                    removed = true;
                    break;
                }
            }
            if (!removed) {
                System.out.println("Траты с id " + id + " не найдена");
            }
        }
    }

    public void printOneExpense(String description) {
        boolean check = false;
        for (Map.Entry<String, List<Expense>> entry : expenses.entrySet()) {
            List<Expense> list = entry.getValue();
            for (Expense expense : list) {
                if (expense.getDescription().equals(description)) {
                    System.out.println(expense);
                    check = true;
                    break;
                }
            }
        }
        if (!check) {
            System.out.println("Траты с таким описание нет");
        }
    }

    public double sumOfAllExpenses() {
        double sum = 0;
        for (Map.Entry<String, List<Expense>> entry : expenses.entrySet()) {
            List<Expense> list = entry.getValue();
            for (Expense expense : list)
                sum += expense.getValue();
        }
        System.out.println("Сумма всех трат: " + sum);
        return sum;
    }

    public void deleteCategory(String category) {
        if (expenses.containsKey(category)) {
            expenses.remove(category);
            System.out.println("Категория " + category + " удалена");
        } else {
            System.out.println("Такой категории нет");
        }
    }

    public String getTheMostExpensiveCategory() {
        String mostExpensiveCategory = null;
        double maxSum = 0;
        for (Map.Entry<String, List<Expense>> entry : expenses.entrySet()) {
            String category = entry.getKey();
            List<Expense> list = entry.getValue();
            double categorySum = 0;
            for (Expense expense : list) {
                categorySum += expense.getValue();
            }
            if (categorySum > maxSum) {
                mostExpensiveCategory = category;
                maxSum = categorySum;
            }
        }
            if (mostExpensiveCategory != null) {
                System.out.println("Самая дорогая категория: " + mostExpensiveCategory);
            }else {
                System.out.println("Нет категорий для анализа");
            }
        return mostExpensiveCategory;
    }

    public void clearAllExpenses() {
        expenses.clear();
        System.out.println("Все траты были удалены");
    }
}








