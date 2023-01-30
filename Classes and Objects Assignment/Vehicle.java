
/* 
Section: INF224
Assignment in CCPRGG2L: Classes and Objects   
Members:
  Catapang, Gabriel
  Dala, Luisa
  Gumarao, Sean Kervin
  Pabilando, Karen Pearl
  Saliendra, Ace
*/

public class Vehicle{

    // Variables of Attributes
    String brand;
    String model;
    int EngineDisplacement;
    int FuelCapacity;
  
    // Methods and Method Names
    public void sayMyBrand(){
      System.out.println("Brand Name: " + brand);
    }
  
    public void sayMyModel(){
      System.out.println("Model: " + model);
    }
  
    public void sayMyEngineDisplacement(){
      System.out.println("Engine Displacement (cc): " + EngineDisplacement);
    }
  
    public void sayMyFuelCapacity(){
      System.out.println("Fuel Capacity (L): " + FuelCapacity);
    }
  }
