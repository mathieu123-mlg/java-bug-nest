package employee_management;

public abstract class TimeEmployee {
    private int employeeId;
    private String name;

    public TimeEmployee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public abstract double calculatePay();
}
