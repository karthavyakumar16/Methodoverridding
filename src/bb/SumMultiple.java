package bb;

public class SumMultiple {
    public int number=3;
    public int range=100;
  public static int findsummultiples(int number,int range){
      int sum=0;
      for(int i=1;i<=range;i++){
          if(i%number==0){
              sum+=i;
          }
      }
      return sum;
  }

    public static void main(String[] args) {
        SumMultiple sub=new SumMultiple();
        System.out.println(sub.number+" "+ sub.range);

    }
}
