package md.tekwill.homework0605;

public class Car {
    String brand;
    String engineType; //benzin disel gas
    double capacityEngine;//  1.5 2
    int horsePowerCar; //90 150 220
    int nrbDoors; //3 4 5
    boolean spareWheel;

    public Car(){
        brand = "unknown";
        nrbDoors = 5;
        spareWheel = true;
    }

    public Car(String newBrand,String newEngineType, double newCapEngine, int newHorsePowerCar){
        this();
        brand = newBrand;
        engineType = newEngineType;
        capacityEngine = newCapEngine;
        horsePowerCar = newHorsePowerCar;
    }

    public void setCar(String newBrand,String newEngineType, double newCapEngine, int newHorsePowerCar, int newNrDoors, boolean newSpareWheel){
        brand = newBrand;
        engineType = newEngineType;
        capacityEngine = newCapEngine;
        horsePowerCar = newHorsePowerCar;
        nrbDoors = newNrDoors;
        spareWheel = newSpareWheel;
    }

    public String getBrand() { return brand; }

    public String getEngineType() { return engineType; }

    public double getCapacityEngine() { return capacityEngine; }

    public int getHorsePowerCar() { return horsePowerCar; }

    public int getNrbDoors() { return nrbDoors; }

    public boolean getSpareWheel() { return spareWheel; }

    public void printDetails(Car obj){
        System.out.println("car description: " + obj.getBrand() + "\t" + obj.getEngineType() + "\t" + obj.getCapacityEngine()+"\t"+ obj.getHorsePowerCar() + "\t" + obj.getNrbDoors() + "\t" + obj.getSpareWheel());
    }
    void run() {
        System.out.println("Car is running...");
    }




}
