package family;

public class TreeDemoTest {

    public static void main(String[] args) {
        Family a=new Family();
        Address aAddress=new Address();
        aAddress.flatNo="1-79";
        aAddress.area="hyd";
        aAddress.city="hyd";
        aAddress.streetName="shivalayam";
        aAddress.country="india";
        a.name="A";
        a.address=aAddress;

        Family b=new Family();
        Address baAddress=new Address();
        baAddress.flatNo="1-79";
        baAddress.area="hyd";
        baAddress.city="hyd";
        baAddress.streetName="shivalayam";
        baAddress.country="india";
        b.name="B";
       b=new Family();
        System.out.println(a.name);
        System.out.println(b.name);

    }
}
