package project2.com;

public class DinnerAdvisor {

    public void getAdvice(double money, int daysBeforeSalary) {
        if (money < 3000) {
            System.out.println("Экономьте и вы дотянете до зп, сегодня лучше поужинать дома");
        } else if (money < 10000) {
            if (daysBeforeSalary < 10) {
                System.out.println("Можно сходить в мак");
            }else {
                System.out.println("Лучше поесть дома");
            }
        } else if (money < 30000) {
            if (daysBeforeSalary < 10) {
                System.out.println("Можно зайти поужинать в классное место");
            }else {
                System.out.println("Можно сходить в мак");
            }
        } else {
            if (daysBeforeSalary < 10) {
                System.out.println("Можно заказать суши");
            }else {
                System.out.println("Сходить в классное место");
            }
        }
    }
}
