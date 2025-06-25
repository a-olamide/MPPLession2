package lesson4.sequence_diagram.ext;

import lesson4.sequence_diagram.Company;
import lesson4.sequence_diagram.Department;
import lesson4.sequence_diagram.Position;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Decksoft");
        Department department = new Department("Drier Building","IT");

        Position position = new Position("Dean", "Dept responsibility");
        Position position2 = new Position("Teaching Assitant", "Teaching Assitant");
        Position position3 = new Position("Software Engineering", "Software Engineering");

        company.addDepartment(department);
        department.addPositions(position);
        department.addPositions(position2);
        department.addPositions(position3);


    }
}
