package Pattern_practice;
interface B_tech{
    void total_branch();
}
class IT implements B_tech{
    public void total_branch(){
        System.out.println("IT branch");
    }
}
class CSE implements B_tech{
    public void total_branch(){
        System.out.println("CSE branch");
    }
}
class AI_ML implements B_tech{
    public void total_branch(){
        System.out.println("AI_ML branch");
    }
}
class MECH implements B_tech{
    public void total_branch(){
        System.out.println("MECH branch");
    }
}
public class interface_class {
    public static void main(String[] args) {
        B_tech b= new IT();
        b.total_branch();
    }
}
