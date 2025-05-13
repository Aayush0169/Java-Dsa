package Interfaces;

public class Car implements Engine,Break,Media{
    int a=50;
    @Override
    public void brake(){
        System.out.println("deaccelerates the car");
    }
    @Override
    public void start(){
        System.out.println("starts the car");
    }
    @Override
    public void stop(){
        System.out.println("stops the car");
    }

    @Override
    public void accelerate(){
        System.out.println("accelerates the car");
    }
}
