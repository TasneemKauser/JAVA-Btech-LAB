package Pattern_practice;
class Student {
    int roll;
    String name;

    public Student() {
        roll=20080;name="TASNEEM KAUSER";
    }
    public int getRoll() {
        return roll;
    }
    public String getName() {
        return name;
    }
}
public class classStudent_constuctor {
    public static void main(String[] args) {
        Student S = new Student();
        System.out.println("The student name is "+S.getName());
        System.out.println("The student roll number is "+S.getRoll());
    }
}
