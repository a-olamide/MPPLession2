package lesson4.sequence_diagram;

public class Employee {
    private String employeeId;
    private String name;
    private double salary;

    public Employee(String employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}
