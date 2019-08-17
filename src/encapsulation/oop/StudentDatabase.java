package encapsulation.oop;

public class StudentDatabase {

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setStName("Rifath");
        st1.setStID(101);
        st1.setStDOB("08-17-1990");

        System.out.println(st1.getStName()+ " " + st1.getStID()+ " " + st1.getStDOB());

        Student st2 = new Student();
        st2.setStName("Sifath");
        st2.setStID(102);
        st2.setStDOB("08-17-1992");

        System.out.println(st2.getStName()+ " " + st2.getStID()+ " " + st2.getStDOB());

    }
}
