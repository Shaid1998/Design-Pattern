
public abstract class AttendanceAdapter implements Attendence{
    
    Student S=null;
    
    void setStudent(Student f){ //object pass
        S = f; // assign
    }
    //@override
    public void giveAttendanc(){
        S.getGiveAttendance();//method call 
    }
    
}
