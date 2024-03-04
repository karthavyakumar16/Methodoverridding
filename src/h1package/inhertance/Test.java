package h1package.inhertance;

public class Test {
    public static void main(String[] args) {
        Employee empolyee=new Employee("KUMAR","1234","25000");
        empolyee.display();
        System.out.println(empolyee.employeeName+empolyee.employeeId+empolyee.employeeSalary);
    }
}
