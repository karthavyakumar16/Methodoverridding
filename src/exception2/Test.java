package exception2;

public class Test {
    public static void main(String[] args) {
        PaymentService paymentService=new PaymentService("12345","54321",9,350);
        try{
            paymentService.login("12345","54321");
            paymentService.seats();
            paymentService.payment();

        }catch (InvalidCredentails e){
            System.out.println("errorcodes"+e.getCode() +"   "+"erroe"+e.getMessage());


        }catch (InvalidInput i){
            System.out.println("ER"+i.getCode()+" "+"er"+i.getMessage());
        }catch (InsufficentBalance t){
            System.out.println("err"+t.getCode()+" " +"err"+t.getMessage());
        }
    }
}
