package project2.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько денег осталось до зарплаты?");
        double restOfMoney = sc.nextDouble();
        System.out.println("Сколько дней осталось до зарплаты?");
        int daysBeforeSalary = sc.nextInt();
        Convertor convertor = new Convertor(105.4, 106.3, 0.66);
        DinnerAdvisor dinnerAdvisor = new DinnerAdvisor();
        ExpenseManager expenseManager = new ExpenseManager();
//        String category;
        while (true) {
            printMenu();
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Ваши сбережения " + restOfMoney + " RUB");
                    System.out.println("В какую валюту перевести? 1.USD, 2.EUR, 3.JPY");
                    int currency = sc.nextInt();
                    convertor.convert(restOfMoney, currency);
                    break;
                case 2:
                    System.out.println("Ваши сбережения " + restOfMoney + " RUB");
                    dinnerAdvisor.getAdvice(restOfMoney, daysBeforeSalary);
                    break;
                case 3:
                    System.out.println("Введите категорию");
                    String category = sc.next();
                    System.out.println("Введите id");
                    int id = sc.nextInt();
                    System.out.println("Введите сумму траты:");
                    double value = sc.nextDouble();
                    System.out.println("Описание траты: ");
                    String description = sc.next();
                    Expense expense = new Expense(id, value, description);
                    expenseManager.addExpense(expense, category);
                    break;
                case 4:
                    System.out.println("Введите категорию");
                    category = sc.next();
                    System.out.println("Введите id траты, которую хотите удалить ");
                    id = sc.nextInt();
                    expenseManager.deleteExpense(id, category);
                    break;
                case 5:
                    expenseManager.printAllExpenses();
                    break;
                case 6:
                    System.out.println("Введи описание");
                    String descreption = sc.next();
                    expenseManager.printOneExpense(descreption);
                    break;
                case 7:
                    System.out.println("Введите категорию");
                    category = sc.next();
                    expenseManager.printAllExpensesByCategory(category);
                    break;
                case 8:
                    expenseManager.sumOfAllExpenses();
                    break;
                case 9:
                    System.out.println("Введите категорию");
                    String category2 = sc.next();
                    expenseManager.deleteCategory(category2);
                    break;
                case 10:
                    expenseManager.getTheMostExpensiveCategory();
                    break;
                case 11:
                    expenseManager.clearAllExpenses();
                    break;
                default:
            }
        }
    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1. Конвертировать валюту");
        System.out.println("2. Получить совет");
        System.out.println("3. Добавить трату в категорию");
        System.out.println("4. Удалить трату");
        System.out.println("5 Вывести все траты по категории");
        System.out.println("6 Показать трату");
        System.out.println("7 Показать траты по категориям");
        System.out.println("8 Вернуть сумму всех трат");
        System.out.println("9 Удалить категорию");
        System.out.println("10 Получить имя самой дорогой категории");
        System.out.println("11 Очистить таблицу трат");
    }
}