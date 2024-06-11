package family;

public class ObjectRefTest {

    public static void main(String[] args) {
        Family test=new Family(); //here i am creating object
        test =new Family();
        // assign the new object to test ref so the object is eligible for garbage collection

        test =new Family();
        test =new Family();
        test.name="A";


        Family ref=test;//now refrernce is assigned test object

        Family ref1=test;//refrernce is assigned test object

        ref1.name="B";
        Family ref2=test;//refrernce is assigned test object

        Family a=new Family();
        a.name="A";
        Family b=new Family();
        a.name="B";//name value is overriddenby the value B

        a=new Family();//new object is assigned to a refernce

        test=a;//in this test refernce is assigned to "a"object but ref,ref1,ref2,are still pointing to the test object

        System.out.println(ref2.name);//so the output of name will be b
        System.out.println(ref1.name);

    }
}
