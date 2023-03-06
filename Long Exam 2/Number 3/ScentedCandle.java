
public class ScentedCandle extends Candle{

    String scent;
   
    public ScentedCandle(String color, String scent, double height) {
        super(color, height);
        this.scent = scent;

    }

    public String getScent(){
        return scent;
    }

    public void setScent(String scent){
        this.scent = scent;
    }

    @Override
    public void setHeight(double height){
        super.setHeight(height);
        this.price = height * 3.0;
    }
    
}
