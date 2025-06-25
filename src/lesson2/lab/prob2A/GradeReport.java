package lesson2.lab.prob2A;

public class GradeReport {
    private Student student;

    GradeReport(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    @Override
    public String toString() {
        return "GradeReport{" +
                "student=" + student.getName() +
                '}';
    }
}
