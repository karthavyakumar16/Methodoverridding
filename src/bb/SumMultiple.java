package bb;

public class SumMultiple {

  public static int findsummultiples(int number1,int number2,int range){
      int sum=0;
      for(int i=1;i<range;i++){
          if(i%number1==0||i%number2==0){
              sum=sum+i;
          }
      }
      return sum;
  }

    public static void main(String[] args) {
        System.out.println(SumMultiple.findsummultiples(3,5,10));

    }
}
