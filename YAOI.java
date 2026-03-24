package yaoi;

import java.util.Scanner;

public class YAOI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vowelCounter = 0;
        System.out.println("write any word bro");
        String text = sc.nextLine();

        for (int i = 0; i < text.length(); i++)
        {
            char c = Character.toLowerCase(text.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCounter++;
            }
        }
        System.out.println("yo the number of volwes is: " + vowelCounter);
    }

}
