package inhertance;

public class Son extends Father{
    public String number;
    public void name(){
        System.out.println("Father name"+name);
    }
    public void number(){
        System.out.println("Son number"+number);
    }


    public static void main(String[] args) {
        Son son=new Son();
        son.name= son.name;
        son.number= son.number;


    }
}
