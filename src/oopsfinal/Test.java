package oopsfinal;

public class Test {
    public static void main(String[] args) {
        PatientDetails patientDetails=new PatientDetails("kumar","96522","24","M","fever");
        System.out.println(patientDetails);
         String dieasetype= patientDetails.getDiesease();
         System.out.println(dieasetype);
        Consultation test;

        if(dieasetype.equalsIgnoreCase("fever")){
            test=new Fever(1500,2500);
        }else{
            test=new Heart(100);
        }

        if(test instanceof Fever){
            String blood=test.bloodTest(20,10);
            System.out.println(blood);
            String temperature=((Fever) test).tempcheck(95);
            System.out.println(temperature);
            String tyoeoftest=test.recamendTest();
            System.out.println(tyoeoftest);
        }


    }
}
