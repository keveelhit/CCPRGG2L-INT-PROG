
public class DemoHorses {
    public static void main(String[] args) {
        RaceHorse h1 = new RaceHorse();
        h1.setName("Pegasus");
        h1.setColor("Black Chestnut");
        h1.setBirthYear(2018);
        h1.setNumOfRaces(8);
        
        RaceHorse h2 = new RaceHorse();
        h2.setName("Napoleon");
        h2.setColor("Red Chestnut");
        h2.setBirthYear(2019);
        h2.setNumOfRaces(10);
        
        RaceHorse h3 = new RaceHorse();
        h3.setName("Phoenix");
        h3.setColor("Blue Dun");
        h3.setBirthYear(2020);
        h3.setNumOfRaces(5);
        
        System.out.println("Name: " + h1.getName());
        System.out.println("Color: " + h1.getColor());
        System.out.println("BirthYear: " + h1.getBirthYear());
        System.out.println("Number of Competed Races: " + h1.getNumOfraces());
        
        System.out.println(" ");
        
        System.out.println("Name: " + h2.getName());
        System.out.println("Color: " + h2.getColor());
        System.out.println("BirthYear: " + h2.getBirthYear());
        System.out.println("Number of Competed Races: " + h2.getNumOfraces());
        
        System.out.println(" ");
        
        System.out.println("Name: " + h3.getName());
        System.out.println("Color: " + h3.getColor());
        System.out.println("BirthYear: " + h3.getBirthYear());
        System.out.println("Number of Competed Races: " + h3.getNumOfraces());
        
    }
}
