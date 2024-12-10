package project2.com;

public class Convertor {
    double rateUSD;
    double rateEUR;
    double rateJPY;

    public Convertor(double rateUSD, double rateEUR, double rateJPY) {
        this.rateUSD = rateUSD;
        this.rateEUR = rateEUR;
        this.rateJPY = rateJPY;
    }

    public void convert(double rub, int currency) {
        switch (currency) {
            case 1 -> System.out.println("Ваши деньги в USD " + (rub/rateUSD));
            case 2 -> System.out.println("Ваши деньги в EUR " + (rub/rateEUR));
            case 3 -> System.out.println("Ваши деньги в JPY " + (rub/rateJPY));
        }
    }
}
