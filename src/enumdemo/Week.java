package enumdemo;

public class Week {
    Day day;
    public Week(){}
    public Week(Day day){
        this.day = day;
    }

    public void whatToDo(){
        switch(day){
            case MONDAY:
                System.out.println("Start reading java book");
                break;
            case TUESDAY:
                System.out.println("Start codelab exercizes");
                break;
            case WEDNESDAY:
                System.out.println("Start joining mentoring session");
                break;
            case THURSDAY:
                System.out.println("Continue codelab");
                break;
            case FRIDAY:
                display();
                System.out.println("Submit Home work");
                break;
            case SATURDAY:
                System.out.println("Join Saturday class");
                break;
            case SUNDAY:
                System.out.println("Join Sunday class");
                break;
            default:
                System.out.println("Not a valid day. Out of your mind !");
                break;
        }

    }

    private void display(){
        System.out.println("Join all the classes for Java and Selenium");
    }
}
