package polymorphism.oop;

public class TestLandCalculator {

    public static void main(String[] args) {
        LandCalculator cal = new LandCalculator();
        int resultOfLine = cal.areaOfland(10,15);
        System.out.println(resultOfLine);
        int resultOfTriangle = cal.areaOfland(10,15, 12);
        System.out.println(resultOfTriangle);

        ModernLandCalculator mCal = new ModernLandCalculator();
        int resultOfModernTriangle = mCal.areaOfland(10,15,12);
        System.out.println(resultOfModernTriangle);

        int resultOfTriangleAfter = cal.areaOfland(10,15, 12);
        System.out.println(resultOfTriangleAfter);
    }
}
