package oopsfinal;

public class Heart implements Consultation {
    public int ECG;

    public Heart(int ECG) {
        this.ECG = ECG;
    }

    @Override
    public String bloodTest(int amtOfBlood, int hbPercentage) {
        if(hbPercentage<10){
            return "low hbPercentage";

        } else if (hbPercentage>10 &&hbPercentage<=14) {
            return "normal hbPercentage";
        }
        else{
            return "required consultation";

        }
    }

    @Override
    public String recamendTest() {
        if(ECG>60 && ECG<100){
            return "normal function of heart";
        } else if (ECG>100 && ECG<130) {
            return "some abnormalities found";

        }else{
            return "high abnormal ecg";
        }
    }
}
