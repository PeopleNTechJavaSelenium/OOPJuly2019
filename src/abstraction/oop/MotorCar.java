package abstraction.oop;

public abstract class MotorCar implements Bus {

    public void drive(){
        System.out.println("Car must be drive able");
    }

    public abstract void hybridEngine();


    public void bigSizeMotorCar(){
        System.out.println("Big shape car that can carry 50 people");
    }
}
