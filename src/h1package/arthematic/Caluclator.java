package h1package.arthematic;

import java.util.concurrent.Callable;

public class Caluclator {
    int a;
    int b;
    int c=a+b;
    public int add(int a,int b){
        int c=a+b;
        return c;
    }
    public int add(int a,int b,int x,int y){
        int c=a+b+x+y;
        return c;
    }
    public int sub(int a,int b){
        int c=a-b;
        return c;
    }
    public int sub(int a,int b,int x,int y){
        int c=a-b-x-y;
        return c;
    }
    public int mul(int a,int b){
        int c=a*b;
        return c;
    }
    public int mul(int a,int b,int x,int y){
        int c=a*b*x*y;
        return c;
    }
    public int div(int a,int b){
        int c=a/b;
        return c;
    }
    public int div(int a,int b,int x,int y){
        int c=a/b/x/y;
        return c;
    }

    public static void main(String[] args) {
       Caluclator caluclator=new Caluclator();
       System.out.println(caluclator.add(2,2));
       System.out.println(caluclator.add(2,2,2,2));
       System.out.println(caluclator.sub(4,2));
       System.out.println(caluclator.sub(8,6,4,2));
       System.out.println(caluclator.mul(4,4));
       System.out.println(caluclator.mul(4,4,4,4));
       System.out.println(caluclator.div(16,4));
       System.out.println(caluclator.div(16,12,8,4));
    }
}
