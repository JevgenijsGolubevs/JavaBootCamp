package sef.module5.sample.mine;

public class MainClass {
    public static void main (String[] args){
        Car myCar = new Car("grey", "mercedes", 2.2, 5, "KNBFMF", 6);

        myCar.fillTank(20);
        //myCar.drive(100);

        System.out.println("Current fuel level " + myCar.fuelInTank);
    }

}
