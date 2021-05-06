package md.tekwill.homework0605;

public class CarApp {
    public static void main(String[] args) {
        //task1
        Car car1 = new Car();
        car1.brand = "Scoda Octavia";
        car1.engineType = "diesel";
        car1.horsePowerCar = 140;
        car1.nrbDoors = 5;
        car1.spareWheel = true;
        System.out.println("car1 description: " + car1.brand + "\t" + car1.engineType + "\t" + car1.horsePowerCar + "\t" + car1.nrbDoors + "\t" + car1.spareWheel);

        //task2
        Car car2 = new Car();
        car2.setCar("Ford Focus", "benzin", 1.5, 100, 5, true);
        System.out.println("car2 description: " + car2.getBrand() + "\t" + car2.getEngineType() + "\t" + car2.getCapacityEngine()+"\t"+ car2.getHorsePowerCar() + "\t" + car2.getNrbDoors() + "\t" + car2.getSpareWheel());

        //task3
        Car car3 = new Car("Toyota Prius","hybrid",1.7,136);
        System.out.println("car3 description: " + car3.getBrand() + "\t" + car3.getEngineType() + "\t" + car3.getCapacityEngine()+"\t"+ car3.getHorsePowerCar() + "\t" + car3.getNrbDoors() + "\t" + car3.getSpareWheel());

        //print
        car3.printDetails(car3);
    }
}
