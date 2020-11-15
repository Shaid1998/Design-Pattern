
public class Driver {

    public static void main(String[] args) {
        
        Student s1 = new Student("Shaidur", "Rahman", 123, "Shaid123");
        Admin a1 = new Admin("Admin", "Admin", 999, "admin123");
        
        
        
        
        AttendanceAdapter AC;
        AC = new AttendanceAdapter() {
            @Override
            public void giveAttendance() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        Student f = null;
       AC.setStudent(f);
        AC.giveAttendanc();
        Teacher t1 = new Teacher("Farzana", "Sadia", 555, "fs123") {
            @Override
            public void giveAttendance() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        t1.giveAttendence();
       a1.addStudent(s1);
        a1.start();

    }

}
