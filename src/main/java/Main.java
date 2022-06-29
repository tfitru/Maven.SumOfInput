import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");

        int userInput = input.nextInt();
        int sum = 0;

        for(int i = 0; i<userInput; i++) {
            sum += i + userInput;
        }
        System.out.println(sum);
    }
}
