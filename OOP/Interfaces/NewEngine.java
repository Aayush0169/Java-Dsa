package Interfaces;

public class NewEngine implements Engine{
    
    @Override
    public void start() {
        System.out.println("Engine Started");
        
    }

    @Override
    public void stop() {
        System.out.println("Engine Stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("Engine is being Accelerated");
    }
}