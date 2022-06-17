package Pattern_practice;

import java.util.Scanner;

public class string {
    static boolean chk(String s){
        int [] frequency= new int[26];
        int n=s.length();
        for (int i=0;i<s.length();i++){
            frequency[(s.charAt(i))-970]+=1;
        }
        for (int i=0;i<frequency.length;i++){
            if (frequency[i]%2==1){
                return false;
            }
        }
        return true;
    }

    //Driver code
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        String s=sr.toString();
        if (chk(s)){
            System.out.println(s.length());
        }
    }
    }
