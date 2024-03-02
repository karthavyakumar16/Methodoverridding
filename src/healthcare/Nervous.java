package healthcare;

public class Nervous {
    public String tissue;
    public String weakness;
    public String condition;

    public Nervous(String tissue,String weakness,String condition){
        this.tissue=tissue;
        this.weakness=weakness;
        this.condition=condition;
    }

    public String getTissue() {
        return tissue;
    }

    public String getWeakness() {
        return weakness;
    }

    public String getCondition() {
        return condition;
    }
}
