package oopsfinal;

public class Fever implements Consultation{
    public int wbc;
    public int platelateCount;

    public Fever(int wbc, int platelateCount) {
        this.wbc = wbc;
        this.platelateCount = platelateCount;
    }

    @Override
    public String bloodTest(int amtOfBlood,int hbPercentage) {
        if(hbPercentage<10){
            return "low hbPercentage";

        } else if (hbPercentage>10 &&hbPercentage<=14) {
            return "normal hbPercentage";
        }
        else{
            return "required consultation";

        }
    }
    public String tempcheck( double temp){
        if(temp>=98 && temp<100){
            return "low fever";
        } else if(temp>=100 && temp<102) {
            return "moderate fever";

        }
        else{
            return "high fever";
        }
    }

    @Override
    public String recamendTest() {
        if(wbc<1000 && platelateCount<15000){
        return "malaria";
    } else if (wbc<1200 && platelateCount<16000) {
            return "dengue";

        }
        else{
            return "tyroid";
        }

        }
    }
