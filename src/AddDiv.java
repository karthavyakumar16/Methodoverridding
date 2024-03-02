public class AddDiv {
    int a;
    int b;

    public int  add(int a,int b) {
        int c = a + b;
        return  c;
        //System.out.println("c:" + c);
    }

    public int sub(int a,int b) {
        int c = a - b;
        return c;
        //System.out.println("c:" + c);
    }

    public int div(int a,int b) {
        int c = a / b;
        return c;
        //System.out.println("c:" + c);


    }

    public int mul(int a,int b) {
        int c = a * b;
        return c;
        //System.out.println("c:" + c);
    }


    public static void main(String[] args) {
        AddDiv addDiv=new AddDiv();
        System.out.println("Addition value is " +addDiv.add(6,6));
        System.out.println("Subtraction value is " +addDiv.sub(6,3));
        System.out.println("Multiplication value is " +addDiv.mul(6,2));
        System.out.println("Division value is " +addDiv.div(6,3));


    }

    }
