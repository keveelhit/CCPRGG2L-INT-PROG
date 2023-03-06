public class Candle {

    String color;
    double height;
    double price;

    public Candle(String color, double height){
        this.color = color;
        setHeight(height);

    }

    public String getColor(){

        return color;
    }

    public double getHeight(){
        return height;
    }

    public double getPrice(){
        return price;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setHeight(double height){
        this.height = height;
        this.price = height * 2;
    }
    
}
