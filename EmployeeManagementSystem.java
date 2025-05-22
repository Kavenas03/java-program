abstract class Employee {
    String name;
    int empId;
    double basicSalary;

    Employee(String name, int empId, double basicSalary) {
        this.name = name;
        this.empId = empId;
        this.basicSalary = basicSalary;
    }

    abstract double calculateSalary();

    void displaySalary() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + calculateSalary());
        System.out.println("------------------------------------");
    }
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name, int empId, double basicSalary) {
        super(name, empId, basicSalary);
    }

    double calculateSalary() {
        return basicSalary + (0.2 * basicSalary);
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int empId, double basicSalary, double hourlyRate, int hoursWorked) {
        super(name, empId, basicSalary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    double calculateSalary() {
        return basicSalary + (hourlyRate * hoursWorked);
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee FullTimeEmp = new FullTimeEmployee("Alice", 101, 50000);
        Employee PartTimeEmp = new PartTimeEmployee("Bob", 102, 20000, 500, 10);

        FullTimeEmp.displaySalary();
        PartTimeEmp.displaySalary();
    }
}
