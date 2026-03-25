
package yuri;
import java.util.Scanner;
public class YURI {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("write any word bro");
        String text = sc.next();
        String Inverted = "";
        for(int i = text.length() -1; i >=0; i--)
            {
                Inverted += text.charAt(i);
    }  
        System.out.println("yo the reverse mountain version of this word is: " + Inverted);
}
}
