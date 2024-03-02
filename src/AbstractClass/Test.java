package AbstractClass;



public class Test {
    public static void main(String[] args) {

        HourlyTeacher hourlyTeacher=new HourlyTeacher("4321","karthavya",
                1000,10);
        System.out.println(hourlyTeacher.displayTeacherDetails("4321","karthavya"));
        System.out.println("Salary is " + hourlyTeacher.calculateSalary());


        SalariedTeacher salariedTeacher=new SalariedTeacher("8765","kumar",
                25000);
        System.out.println(salariedTeacher.displayTeacherDetails("8765","kumar"));
        System.out.println("Salary is " + salariedTeacher.calculateSalary());


        ContractTeacher contractTeacher=new ContractTeacher("8361","kk",
                3,1500,15);
        System.out.println(contractTeacher.displayTeacherDetails("8361","kk"));

        System.out.println("Salary is " + contractTeacher.calculateSalary());
    }
}
