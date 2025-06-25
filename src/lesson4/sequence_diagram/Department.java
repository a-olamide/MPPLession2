package lesson4.sequence_diagram;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private String location;
    private List<Position> positions;

    public Department(String location, String name) {
        this.location = location;
        this.name = name;
        this.positions = new ArrayList<Position>();
    }
    public String getName() {
        return name;
    }
    public List<Position> getPositions() {
        return positions;
    }
    public void addPositions(Position position) {
        this.positions.add(position);
    }
    public double getSalary() {
        double totalSalary = 0;
        for (Position position : positions) {
            totalSalary += position.getSalary();
        }
        return totalSalary;
    }
}
