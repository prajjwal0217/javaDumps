import javax.sound.sampled.SourceDataLine;

class Car{
    public void acclerate(){
        System.out.println("Car is acclerating");
    }
    public void gear(){System.out.println("Mannul gear");}
    public void start(){ System.out.println("Car has strated");}
}

class LuxCar extends Car{
    @Override
    public void gear(){System.out.println("Automatic gear");}
    public void sunroof(){System.out.println("sunroof is now open");}

}

public class I4 {
    public static void main(String[] args) {
        
        Car obj1 = new Car();
        obj1.acclerate();
        obj1.gear();
        obj1.start();

        LuxCar obj2 = new LuxCar();
        obj2.acclerate();
        obj2.gear(); // shaode the parent method
        obj2.start();
        obj2.sunroof();

        Car obj3 = new LuxCar();
        obj3.acclerate();
        obj3.gear(); // child class method will display
        obj3.start();
        //obj3.sunroof(); this will not work beacuse the refernce is of parent class that does not contain this method 
        
    }
    
}
