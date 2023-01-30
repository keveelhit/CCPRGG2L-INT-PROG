
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

public class Car {
   
  public static void main(String[] args) throws Exception { 

    
    // Attributes of the Object "car"
    Vehicle car1 = new Vehicle();
    car1.brand = "Toyota";
    car1.model = "Vios";
    car1.EngineDisplacement = 1496;
    car1.FuelCapacity = 42;
    // method call
    car1.sayMyBrand();
    car1.sayMyModel();
    car1.sayMyEngineDisplacement();
    car1.sayMyFuelCapacity();

    Vehicle car2 = new Vehicle();
    car2.brand = "Honda";
    car2.model = "City";
    car2.EngineDisplacement = 1498;
    car2.FuelCapacity = 40;
    //method call
    car2.sayMyBrand();
    car2.sayMyModel();
    car2.sayMyEngineDisplacement();
    car2.sayMyFuelCapacity();

    Vehicle car3 = new Vehicle();
    car3.brand = "Maserati";
    car3.model = "GranTurismo";
    car3.EngineDisplacement = 4244;
    car3.FuelCapacity = 86;
    // method call
    car3.sayMyBrand();
    car3.sayMyModel();
    car3.sayMyEngineDisplacement();
    car3.sayMyFuelCapacity();
  }
}
