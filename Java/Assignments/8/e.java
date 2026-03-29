class Employee {
    protected double salary;
    
    public Employee(double salary) {
        this.salary = salary;
    }
    
    public double getSalary() {
        return salary;
    }
}

class Programmer extends Employee {
    private double bonus;
    
    public Programmer(double salary, double bonus) {
        super(salary);
        this.bonus = bonus;
    }
    
    public double getBonus() {
        return bonus;
    }
    
    public double getTotalIncome() {
        return salary + bonus;
    }
    
    public void displayIncome() {
        System.out.println("Salary: $" + salary);
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Income: $" + getTotalIncome());
    }
    
    public static void main(String[] args) {
        Programmer programmer = new Programmer(50000, 10000);
        programmer.displayIncome();
    }
}