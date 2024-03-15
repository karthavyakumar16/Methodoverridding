package h1package.constructorinstalizeobjects;

public class Employee {
    public String name;
    public String id;
    public String salary;
    public String number;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", salary='" + salary + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public Employee(String name, String id, String salary){
        this.name=name;
        this.id=id;
        this.salary=salary;

    }
    public Employee(String name,String id,String salary,String number){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.number=number;
    }

    public static void main(String[] args) {
        Employee employee=new Employee("kumar","1234","25000");
        System.out.println(employee);
        Employee employee1=new Employee("kumar1","4321","26000");
        System.out.println(employee1);
        Employee employee2=new Employee("kumar2","12345","2800","9652295359");
        System.out.println(employee2);

    }
}
