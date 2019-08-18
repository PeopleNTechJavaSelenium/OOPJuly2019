package polymorphism.oop;

public class LandCalculator {

    public int areaOfland(int a, int b){
        int total = a + b;
        return total;
    }
    public int areaOfland(String a, int b){
        int total = b;
        return total;
    }
    public int areaOfland(int a, int b, int c){
        int total = a + b + c;

        return total;
    }
    public int areaOfland(int a, int b, int c, int d){
        int total = a + b;

        return total;
    }
}
