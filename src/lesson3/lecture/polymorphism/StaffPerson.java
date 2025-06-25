package lesson3.lecture.polymorphism;

public abstract class StaffPerson {
    private String name;
    private String address;
    private String phoneNumber;
    private VehincleType drivesVehincle;

    public StaffPerson(String name, String address, String phoneNumber, VehincleType drivesVehincle) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.drivesVehincle = drivesVehincle;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public VehincleType getDrivesVehincle() {
        return drivesVehincle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setDrivesVehincle(VehincleType drivesVehincle) {
        this.drivesVehincle = drivesVehincle;
    }

    abstract double computeStipend();
}

