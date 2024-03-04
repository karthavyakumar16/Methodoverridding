package h1package;

public class Test {
    public static void main(String[] args) {
        Student student=new Student("852","kk","harvest");
        student.details();
        System.out.println(student.studentId+student.studentName+student.schoolName);
    }
}
