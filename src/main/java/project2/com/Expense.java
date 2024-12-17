package project2.com;

import java.util.Objects;

public class Expense {

    int id;
    double value;
    String description;

    public Expense(int id, double value, String description) {
        this.id = id;
        this.value = value;
        this.description = description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Expense expense = (Expense) o;
        return id == expense.id && Double.compare(value, expense.value) == 0 && Objects.equals(description, expense.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value, description);
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public double getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public Expense (){}

    @Override
    public String toString() {
        return
                "сумма = " + value +
                ", описание = '" + description + '\'' ;
    }
}
