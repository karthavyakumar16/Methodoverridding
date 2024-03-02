package EmployDetails;

public class Test {
    public static void main(String[] args) {

        HourlyEmployee hourlyEmployee=new HourlyEmployee("4321","karthavya",
                1000,10);
        System.out.println(hourlyEmployee.displayEmployeeDetails("4321","karthavya"));
        System.out.println("Salary is " + hourlyEmployee.calculateSalary());


        SalariedEmployee salariedEmployee=new SalariedEmployee("8765","kumar",
                25000);
        System.out.println(salariedEmployee.displayEmployeeDetails("8765","kumar"));
        System.out.println("Salary is " + salariedEmployee.calculateSalary());


        ContractEmployee contractEmployee=new ContractEmployee("8361","kk",
                3,1500,15);
        System.out.println(contractEmployee.displayEmployeeDetails("8361","kk"));

        System.out.println("Salary is " + contractEmployee.calculateSalary());
    }
}
