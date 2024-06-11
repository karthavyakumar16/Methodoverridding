package oopsfinal;

public class PatientDetails {
    public String name;
    public String number;
    public String age;
    public String gender;
    public String diesease;

    public PatientDetails(String name, String number, String age, String gender, String diesease) {
        this.name = name;
        this.number = number;
        this.age = age;
        this.gender = gender;
        this.diesease = diesease;
    }

    @Override
    public String toString() {
        return "PatientDetails{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", diesease='" + diesease + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDiesease() {
        return diesease;
    }
}
