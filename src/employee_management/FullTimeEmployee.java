package employee_management;

public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(int employeeId, String name, double monthlySalary) {
        super(employeeId, name);
        this.monthlySalary = monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculatePay() {
        return( (float) 20/100 * monthlySalary);
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                super.toString() +
                ", monthlySalary=" + monthlySalary +
                '}';
    }
}

