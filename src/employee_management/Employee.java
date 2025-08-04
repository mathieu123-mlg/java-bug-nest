package employee_management;

import java.util.Objects;

public abstract class Employee {
    private int employeeId;
    private String name;

    public Employee(int employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public abstract double calculatePay();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeId == employee.employeeId && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, name);
    }

    @Override
    public String toString() {
        return "employeeId="+this.employeeId + ", name="+this.name;
    }
}
