
public class DemoCandle {
    public static void main(String[] args) {

        // Color, Height
        Candle c1 = new Candle("Red", 10);
        Candle c2 = new Candle("Blue", 15);
        
        //Color, Scent, Height
        ScentedCandle s1 = new ScentedCandle("Pink","Roses", 5);
        ScentedCandle s2 = new ScentedCandle("Brown","Chocolate", 15);

        // Candle c1
        System.out.println();
        System.out.println("====="+"  Hail's Handmade Candles  "+ "=====");
        System.out.println("Candle 1");
        System.out.println("Color: " + c1.getColor());
        System.out.println("Height: " + c1.getHeight());
        System.out.println("Price: $" + c1.getPrice());
        System.out.println("======================");
        
        // Candle c2
        System.out.println("Candle 2");
        System.out.println("Color: " + c2.getColor());
        System.out.println("Height: " + c2.getHeight());
        System.out.println("Price: $" + c2.getPrice());
        System.out.println("======================");
        
        // Scented Candle s1
        System.out.println("Scented Candle 1");
        System.out.println("Color: " + s1.getColor());
        System.out.println("Height: " + s1.getHeight());
        System.out.println("Price: $" + s1.getPrice());
        
        // Scented Candle s2
        System.out.println("======================");
        System.out.println("Scented Candle 2");
        System.out.println("Color: " + s2.getColor());
        System.out.println("Height: " + s2.getHeight());
        System.out.println("Price: $" + s2.getPrice());
        System.out.println("======================");
        System.out.println();

    }

}

