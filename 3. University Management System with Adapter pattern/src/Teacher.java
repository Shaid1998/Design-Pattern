
import java.util.ArrayList;


public abstract class Teacher extends Person implements Attendence{

    private ArrayList<Lesson> lessonListTeacher;
    public void giveAttendence(){
        System.out.println("Attendance is given");
    }
    public ArrayList<Lesson> getLessonListTeacher() {
        return lessonListTeacher;
    }

    public ArrayList<Lesson> getLessonList() {
        return lessonListTeacher;
    }

    @Override
    public String toString() {
        return "Teacher is: " + getName() + getSurname();
    }

    public ArrayList<Lesson> listTeacher() {
        return listTeacher();
    }

    public Teacher(String name, String surname, int id, String password) {
        super(name, surname, id, password);
        lessonListTeacher = new ArrayList<>();
      }

    public String printTranscriptT() {

        return " Your lessons are { " + lessonListTeacher + "}";

    }

    
}
