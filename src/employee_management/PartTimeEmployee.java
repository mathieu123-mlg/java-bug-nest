package employee_management;

public class PartTimeEmployee extends TimeEmployee {
    private double hoursWorked;
    private double hourlyRate;


    public PartTimeEmployee(int employeeId, String name, double hoursWorked, double hourlyRate) {
        super(employeeId, name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }
}

