package AbstractClass;

public class HourlyTeacher extends TeacherDetails {
    private int  hourlyRate;
    private int hourlyWorked;

    public HourlyTeacher(String teacherId, String teacherName, int hourlyRate, int hourlyWorked) {
        super(teacherId, teacherName);
        this.hourlyRate = hourlyRate;
        this.hourlyWorked = hourlyWorked;
    }
    public String displayTeacherDetails(String teacherId,String teacherName){
        return "Teacher Id " +teacherId + "Teacher Name " + teacherName;

    }

    public double calculateSalary(){

        return hourlyRate*hourlyWorked;
    }
}
