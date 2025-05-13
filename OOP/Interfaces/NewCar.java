package Interfaces;

public class NewCar{
    private Engine engine;
    private Media media;
    
    public NewCar(){
        engine=new NewEngine();
        media=new mediaPlayer();
    }

    public NewCar(Engine engine){
        this.engine=engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        media.start();
    }

    public void stopMusic(){
        media.stop();
    }

    public void changeEngine(){
        this.engine=new ElectricEngine();
        System.out.println("Engine change succesful");
    }
}