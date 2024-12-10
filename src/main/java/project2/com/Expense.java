package project2.com;

public class Expense {

    double value;
    String description;

    public Expense(double value, String description) {
        this.value = value;
        this.description = description;
    }

    @Override
    public String toString() {
        return
                "сумма = " + value +
                ", описание = '" + description + '\'' ;
    }
}
