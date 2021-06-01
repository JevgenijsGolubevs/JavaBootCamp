package sef.module5.sample.mine;

public class Car {
    String color;
    String name;
    double engineV;
    double fuelConsumption;
    String id;

    public Car(String color, String name, double engineV, double fuelConsumption, String id, double fuelInTank) {
        this.color = color;
        this.name = name;
        this.engineV = engineV;
        this.fuelConsumption = fuelConsumption;
        this.id = id;
        this.fuelInTank = fuelInTank;
    }







    double fuelInTank;


    void fillTank (int fuelV){
        fuelInTank = fuelInTank+fuelV;
    }

    void drive (double distance){
        fuelInTank = fuelInTank-distance/100*fuelConsumption;
    }

}
