package sef.module7.activity;

public class DrivingActivity {
    public static void main(String arg[]){
        Moving m1 = new Car();
        Moving m2 = new Motorcycle();

        Driver d = new Driver("Chupapi Munyonyo");
        Driver m = new Driver("Koko Jambo");

        d.setDriversMoving(m1);
        d.driverStartsDriving();

        m.setDriversMoving(m2);
        m.driverStartsDriving();

    }
}
