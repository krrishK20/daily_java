import java.util.Scanner;

public class Array_index_out_of_bound{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the new size of the array: ");
        int new_size = sc.nextInt();

        for(int i = 0; i<new_size; i++){
            try{
                System.out.println("Element at index " + i + ": " + arr[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Index " + i + " is out of bounds for the array.");
            }
            finally{
                System.out.println("This block is always executed.");
            }
        }
    }
}