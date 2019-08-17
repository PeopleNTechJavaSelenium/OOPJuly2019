package abstraction.oop;

public class Toyota extends MotorCar implements Car{

    public void shape(){
        System.out.println("Car shape must be smaller than 6 feet");
    }

    public void start(){
        System.out.println("Car must have start method to start the engine");
    }

    public void stop(){
        System.out.println("Car must have break system to stop the car");
    }

    public void energy(){
        System.out.println("Car run by oil");
    }

    public void hybridEngine(){
        System.out.println("Car consume less fuel");
    }
}
