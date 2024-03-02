public class Arthemetic {
    public int a;
    public int b;

    public int add(int a,int b){
        int c=a+b;
        return c;
    }
    public int sub(int a,int b){
        int c=a-b;
        return c;
    }
    public int mul(int a,int b){
        int c=a*b;
        return c;
    }
    public int div(int a,int b){
        int c=a/b;
        return c;
    }

    public static void main(String[] args) {
        Arthemetic arthemetic=new Arthemetic();
        System.out.println("the addition value is"+arthemetic.add(6,8));
        System.out.println("the subraction value is"+arthemetic.sub(4,9));
        System.out.println("the multiplication value is"+arthemetic.mul(4,4));
        System.out.println("the division value is"+arthemetic.div(10,2));
    }
}
