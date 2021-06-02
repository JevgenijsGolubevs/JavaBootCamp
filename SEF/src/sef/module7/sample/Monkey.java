package sef.module7.sample;

public class Monkey {

    private Strategy myStrategy;
    private String name;

    public Monkey(String name){
        this.name = name;
    }


    public void setStragey(Strategy strategy){
        myStrategy = strategy;
    }

    public void executeStrategy() {
        System.out.print("Monkey " + name + " executing his strategy...");
        myStrategy.execute();
    }
}
