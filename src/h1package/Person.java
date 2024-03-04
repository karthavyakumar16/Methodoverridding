package h1package;

public class Person {
    public String name;
    public String fatherName;
    public String motherName;
    public String mobileNumber;
    public Person(String name,String fatherName,String motherName,String mobileNumber){
        this.name=name;
        this.fatherName=fatherName;
        this.motherName=motherName;
        this.mobileNumber=mobileNumber;
    }
    public void details(){
        System.out.println("name is"+name+"fathername is"+fatherName+"mothername is"+motherName+"mobilenumder is"+mobileNumber);
    }

}
