package EmployDetails;

public class ContractEmployee extends EmployeeDetails {
    private int contractDuration;
    private int hourlyRate;
    private int totalHoursWorked;

    public ContractEmployee(String employeeId, String employeeName, int contractDuration, int hourlyRate, int totalHoursWorked) {
        super(employeeId, employeeName);
        this.contractDuration = contractDuration;
        this.hourlyRate = hourlyRate;
        this.totalHoursWorked = totalHoursWorked;
    }
    public ContractEmployee(String employeeId, String employeeName) {
        super(employeeId, employeeName);
    }

    public String displayEmployeeDetails(String employeeId,String employeeName){
        return "Employee Id " +employeeId + "Employee Name " + employeeName;

    }
    public double calculateSalary(){
        return hourlyRate*totalHoursWorked;
    }
}
