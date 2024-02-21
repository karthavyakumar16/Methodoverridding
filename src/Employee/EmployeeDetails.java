package Employee;

public class EmployeeDetails {
    public String name;
    public String fatherName;
    public String moblieNo;
    public String employId;

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", moblieNo='" + moblieNo + '\'' +
                ", employId='" + employId + '\'' +
                '}';
    }
}
