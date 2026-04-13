package StringAndStringBuilder;

import java.util.Scanner;

public class toggleTheCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        System.out.println("Before toggle"+sb);
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            int ascii=(int)ch;
            if(ascii>=65 && ascii<=90){
                ascii+=32;
            }
            else{
                ascii-=32;
            }
            ch=(char)ascii;
            sb.setCharAt(i,ch);
        }
        System.out.println("After Toggle"+sb);
    }
}
