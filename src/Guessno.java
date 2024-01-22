import java.util.Random;
import java.util.Scanner;

public class Guessno {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        Random ran=new Random();
        int compo= ran.nextInt(10);
        while(true) {
            int MyGuess = s.nextInt();

            if (MyGuess == compo) {
                System.out.println("Your guess number :" + MyGuess + "is correct");
                break;
            }
            if(MyGuess<compo)
            {
                System.out.println("Your guess number:"+MyGuess+"is lower");
            }
            else {
                System.out.println("Your guess number:"+MyGuess+"is higher");
            }
        }

    }
}
