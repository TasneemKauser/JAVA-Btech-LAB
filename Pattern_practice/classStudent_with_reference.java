package Pattern_practice;
class stud{             //class
    int roll;String name,branch;
    }
public class classStudent_with_reference {
    public static void main(String[] args) {
        stud s=new stud();  //initializing objects
        s.name="Tasneem kauser";
        s.roll=80;
        s.branch="CSIT";
        System.out.println("My name is "+s.name+"\nMy roll is "+ s.roll+"\nMy branch is "+ s.branch);
    }

}
