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

    public void setBrand(String newBrand){ brand = newBrand; }

    public void setEngineType(String newEngineType){ engineType = newEngineType; }

    public void setCapacityEngine(double newCapEngine){ capacityEngine = newCapEngine; }

    public void setCapacityEngine(int newHorsePowerCar){ horsePowerCar = newHorsePowerCar; }

    public void setNrDoors(int newNrDoors){ nrbDoors = newNrDoors; }

    public void setSpareWheel (boolean newSpareWheel ){ spareWheel = newSpareWheel; }

    public String getBrand() { return brand; }

    public String getEngineType() { return engineType; }

    public double getCapacityEngine() { return capacityEngine; }

    public int getHorsePowerCar() { return horsePowerCar; }

    public int getNrbDoors() { return nrbDoors; }

    public boolean getSpareWheel() { return spareWheel; }

    public void printDetails(){
        System.out.println("car description: " + this.getBrand() + "\t" + this.getEngineType() + "\t" + this.getCapacityEngine()+"\t"+ this.getHorsePowerCar() + "\t" + this.getNrbDoors() + "\t" + this.getSpareWheel());
    }
}
