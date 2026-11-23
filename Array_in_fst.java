import java.util.ArrayList;

public class Array_in_fst{
    public static void main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        numbers.add(0, 40);

        System.out.println(numbers);
    }
}