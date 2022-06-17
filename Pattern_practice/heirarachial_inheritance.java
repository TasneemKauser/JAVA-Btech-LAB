package Pattern_practice;

class family{
    public void type(){
        System.out.println("This is small family!");
    }
}
class mother extends family{
    public void boss(){
        System.out.println("The boss lady of the family is mother!");
    }
}
class father extends family{
    public void pillar(){
        System.out.println("The father is the pillar of the family!");
    }
}
class siblings extends family{
    public void spark(){
        System.out.println("The siblings give the spark for the happy family!");
    }
}
public class heirarachial_inheritance {
    public static void main(String[] args) {
        mother m=new mother();
        m.type();
        m.boss();
        System.out.println();
        father f=new father();
        f.type();
        f.pillar();
        System.out.println();
        siblings s=new siblings();
        s.type();
        s.spark();
    }
}
