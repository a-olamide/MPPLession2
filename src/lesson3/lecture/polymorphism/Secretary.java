package lesson3.lecture.polymorphism;

public class Secretary extends StaffPerson {
    private int yerasOfService;

    public Secretary(String name, String address, String phoneNumber, VehincleType drivesVehincle, int yerasOfService) {
        super(name, address, phoneNumber, drivesVehincle);
        this.yerasOfService = yerasOfService;
    }
    public int getYerasOfService() {
        return yerasOfService;
    }

    @Override
    double computeStipend() {
        return 5.5;
    }
}
