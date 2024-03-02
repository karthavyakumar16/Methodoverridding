package AbstractClass;

public class ContractTeacher extends TeacherDetails{
    private int contractDuration;
    private int hourlyRate;
    private int totalHoursWorked;

    public ContractTeacher(String teacherId, String teacherName, int contractDuration, int hourlyRate, int totalHoursWorked) {
        super(teacherId, teacherName);
        this.contractDuration = contractDuration;
        this.hourlyRate = hourlyRate;
        this.totalHoursWorked = totalHoursWorked;
    }


    public String displayTeacherDetails(String teacherId,String teacherName){
        return "Teacher Id " +teacherId + "Teacher Name " + teacherName;

    }
    public double calculateSalary(){
        return hourlyRate*totalHoursWorked;
    }
}
