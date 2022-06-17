package Pattern_practice;
    class student{             //class
        int roll,admission_year;;String name,college,branch;
        public void details(){
            System.out.println("My name is "+name);
            System.out.println("My college name is "+college);
            System.out.println("My roll number is "+roll);
            System.out.println("My branch name is "+branch);
            System.out.println("My admission year is "+admission_year);
        }
    }
    public class classStudent_methods {
        public static void main(String[] args) {
            student student1=new student();  //initializing objects
            student1.college="C.V RAMAN GLOBAL UNIVERSITY";
            student1.name="Tasneem kauser";
            student1.roll=80;
            student1.branch="CSIT";
            student1.admission_year=2020;
            student1.details();
            System.out.println();

            student student2=new student();  //initializing objects
            student2.college="C.V RAMAN GLOBAL UNIVERSITY";
            student2.name="Priyatam";
            student2.roll=34;
            student2.branch="Cyber security";
            student2.admission_year=2020;
            student2.details();
        }
}
