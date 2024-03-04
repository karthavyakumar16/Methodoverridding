package h1package;

public class Student extends Person {
    public String studentId;
    public String studentName;
    public String schoolName;

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public Student(String studentId, String studentName, String schoolName){
        super("karthavya","kumar","lalitha","96522");
        this.studentId=studentId;
        this.studentName=studentName;
        this.schoolName=schoolName;


    }
}
