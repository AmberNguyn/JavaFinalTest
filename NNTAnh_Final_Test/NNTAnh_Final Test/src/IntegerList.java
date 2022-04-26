import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class IntegerList {
    public static void main(String[] args) {
        List<Integer> NumberList = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number you want to add to the list. Enter -99 if you want to stop: ");
            number = keyboard.nextInt();
            NumberList.add(number);

        } while (number != -99);

        Collections.sort(NumberList);

        for (int numb: NumberList
             ) {
            System.out.println(numb);
        }


    }



}
