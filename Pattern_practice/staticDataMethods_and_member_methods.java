package Pattern_practice;
class myself{
    int id;String name;
    static String college="C.V RAMAN GLOBAL UNIVERSITY";
    myself(int MY_id,String n){
        id=MY_id;name=n;
    }
    static void change(){
        college="KIIT";
    }
    void display(){
        System.out.println("Roll  number is "+id+"\nName is "+name+"\nCollege name is "+college);
    }
}

public class staticDataMethods_and_member_methods {
    public static void main(String[] args) {
        myself a=new myself(80,"Tasneem");a.display();
        System.out.println();

        myself b=new myself(30,"Kishu");b.display();
        System.out.println();

        myself.change();
        myself c=new myself(25,"Nisha");c.display();

    }
}
