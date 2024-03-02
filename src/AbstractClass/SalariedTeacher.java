package AbstractClass;

public class SalariedTeacher extends TeacherDetails{
    private int monthlySalary;

    public SalariedTeacher(String teacherId, String teacherName, int monthlySalary) {
        super(teacherId, teacherName);
        this.monthlySalary = monthlySalary;
    }
    public String displayTeacherDetails(String teacherId,String teacherName){
        return "Teacher Id " +teacherId + "Teacher Name " + teacherName;

    }
    public double calculateSalary(){
        return monthlySalary;
    }


}
