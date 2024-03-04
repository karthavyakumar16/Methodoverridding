package h1package.constructorinstalizeobjects;

public class Employee {
    public String name;
    public String id;
    public String salary;
    public Employee(String name,String id,String salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public static void main(String[] args) {
        Employee employee=new Employee("kumar","1234","25000");
        System.out.println(employee.name+employee.id+employee.salary);
        Employee employee1=new Employee("kumar1","4321","26000");
        System.out.println(employee1.name+employee1.id+employee1.salary);
        Employee employee2=new Employee("kumar2","2345","27000");
    }
}
