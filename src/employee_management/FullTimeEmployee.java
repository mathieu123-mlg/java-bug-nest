package employee_management;

public class FullTimeEmployee {
    private int employeeId;
    private String name;
    private double monthlySalary;

    public FullTimeEmployee(int employeeId, String name, double monthlySalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double calculatePay() {
        return monthlySalary;
    }
}

