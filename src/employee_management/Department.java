package employee_management;

import java.util.Set;

/**
 * TODO : a department is a collection of employees. It has a name and a set of employees in it.
 */
public class Department {
    /**
     * TODO : Employees should never ever be duplicated in a single department.
     * Please check if it already exists in the department before inserting if need be. Duplicate
     * here means : their employee id and name are the same.
     *
     * TODO : for our HR officer, give a function to show all details about employees, including
     * their pay.
     */
    private String departmentName;
    private Set<Employee> employees;

    public Department(String departmentName, Set<Employee> employees) {
        this.departmentName = departmentName;
        this.employees = employees;
    }

    public void afficherDetailsSensibles() {
        System.out.println("=== Détails RH (Département : " + departmentName + ") ===");
        for (Employee emp : employees) {
            System.out.println("Nom: " + emp.getName());

            if (emp instanceof PartTimeEmployee) {
                PartTimeEmployee empHoraire = (PartTimeEmployee) emp;
                System.out.println("  - Taux horaire: " + empHoraire.getHourlyRate());
                System.out.println("  - Revenu estimé: " + empHoraire.calculatePay());
            }
            else if (emp instanceof FullTimeEmployee) {
                FullTimeEmployee empTempsPlein = (FullTimeEmployee) emp;
                System.out.println("  - Salaire mensuel: " + empTempsPlein.getMonthlySalary());
            }
        }
    }
}
