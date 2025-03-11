import org.w3c.dom.css.CSSUnknownRule;

public class OnlineCourse {
    String courseName;
    int duration;
    double fee;
    static String instituteName;

    OnlineCourse(String courseName,int duration,double fee){
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    void displayCourseDetails(){
        System.out.println("Course Name: "+courseName);
        System.out.println("Duration: "+duration);
        System.out.println("Fee: "+fee);
    }

    void updateInstituteName(){
        System.out.println("Institute Name: "+instituteName);
    }

    public static void main(String[] args) {
        OnlineCourse c1 = new OnlineCourse("Cyber", 5, 2500);
        c1.instituteName="cousera";
        c1.displayCourseDetails();
        c1.updateInstituteName();
    }
}
