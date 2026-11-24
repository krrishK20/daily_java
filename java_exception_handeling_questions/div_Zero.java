import java.util.Scanner;

public class div_Zero{
    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number A = " );
       int a = sc.nextInt();
       System.out.println("Enter the number B = " );
       int b = sc.nextInt();

       try{
        int c = a/b;
        System.out.println("The result of A/B = "+c);
       }
       catch(ArithmeticException e){
        System.out.println("Error: Division by zero is not allowed.");
       }
       finally{
        System.out.println("Execution completed.");
    }
}
}