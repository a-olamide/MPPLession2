package lesson3.lecture.polymorphism;

public class Faculty extends StaffPerson {
    private String title;

    public Faculty(String name, String address, String phoneNumber, VehincleType drivesVehincle, String title) {
        super(name, address, phoneNumber, drivesVehincle);
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    @Override
    double computeStipend() {
        return 2.6;
    }
}
