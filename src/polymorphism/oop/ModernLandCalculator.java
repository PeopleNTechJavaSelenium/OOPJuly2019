package polymorphism.oop;

public class ModernLandCalculator extends LandCalculator{
    @Override
    public int areaOfland(int a, int b, int c){
        int total = a + b + c - 1;

        return total;
    }

}
