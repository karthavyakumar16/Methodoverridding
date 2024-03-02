package AbstractClass;

public abstract class TeacherDetails {
    protected String teacherId;
    protected String teacherName;
    public TeacherDetails(String teacherId,String teacherName){
        this.teacherId=teacherId;
        this.teacherName=teacherName;

    }
    public String displayTeacherDetails(String teacherId,String teacherName){
        return "Teacher Id " +teacherId + "Teacher Name " + teacherName;

    }
    public abstract  double calculateSalary();
}
