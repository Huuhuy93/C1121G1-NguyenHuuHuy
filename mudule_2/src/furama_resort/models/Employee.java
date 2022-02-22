package furama_resort.models;

public class Employee extends Person{
    private static int employeeCode; //tự động tăng Customer theo id.
    private String level;
    private String position;
    private int salary;
    private int employeeId;


    public Employee() {
        this.employeeId = this.employeeCode++ +1; //Bắt đầu từ 1.
    }

    public Employee(String level, String position, int salary) {
        this.employeeId = this.employeeCode++ +1;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String fullName, String dateOfBirth, String gender, int identityCardNumber, String phoneNumber,
                    String email, String level, String position, int salary) {
        super(fullName, dateOfBirth, gender, identityCardNumber, phoneNumber, email);
        this.employeeId = this.employeeCode++ +1;
        this.employeeCode = employeeCode;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public static int getEmployeeCode() {
        return employeeCode;
    }

    public static void setEmployeeCode(int employeeCode) {
        Employee.employeeCode = employeeCode;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + employeeId + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", identityCardNumber=" + identityCardNumber +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public String getInfo() {
        return this.employeeId+","+ super.getInfo()+","+this.level+","+this.position+","+this.salary;
    }
}
