package QuestionsInterview;

public class Main {
    public static void main(String[] args) {

    }
}

class Employee {
    String name;
    Salary salary;
    Employee(String name, Salary salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Salary {
    double value;
    Currency currency;
    Salary(double value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }
}

enum Currency {
    INR, USD
}
