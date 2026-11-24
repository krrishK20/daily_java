import java.util.Scanner;

public class Number_format_exception{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        boolean validInput = false;

        while(!validInput){
            System.out.print("Enter your age: ");
            String input =sc.nextLine().trim();

            try{
                age = Integer.parseInt(input);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }

        }
        System.out.println("Your age is: " + age);
        sc.close();




    }
}