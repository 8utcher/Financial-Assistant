package project2.com;

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
                    System.out.println("Введите id траты для добавления в список:");
                    int id = sc.nextInt();
                    System.out.println("Введите сумму траты:");
                    double amount = sc.nextDouble();
                    expenseManager.addExpense(id, amount);
                    break;
                case 4:
                    System.out.println("Введите id траты, которую хотите удалить ");
                    id = sc.nextInt();
                    expenseManager.deleteExpense(id);
                    break;
                case 5:
                    expenseManager.printAllExpenses();
            }
        }
    }

    public static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1. Конвертировать валюту");
        System.out.println("2. Получить совет");
        System.out.println("3. Добавить трату ");
        System.out.println("4. Удалить трату");
        System.out.println("5 Вывести все траты");
    }
}
// Создать класс Expense, трата (величина траты, номер траты)
// Добавить ExpenseManager сервис по работе с тратами (список трат)
