package h1package.inhertance;

public class Employee extends Company {
    public String employeeName;
    public String employeeId;
    public String employeeSalary;

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeSalary() {
        return employeeSalary;
    }

    public Employee(String employeeName, String employeeId, String employeeSalary){
        super("neoteric","kphb","2");
        this.employeeName=employeeName;
        this.employeeId=employeeId;
        this.employeeSalary=employeeSalary;

    }
}
