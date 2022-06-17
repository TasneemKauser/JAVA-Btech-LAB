package Pattern_practice;
import java.io.*;
import java.util.*;
class Test
{
    public static void main(String[] args)
    {
        try{
            Scanner s=new Scanner(new BufferedReader(new FileReader("roshni.txt")));
            while (s.hasNext())
            {
                System.out.println(s.next());
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println("getting Exception");
        }
    }
}