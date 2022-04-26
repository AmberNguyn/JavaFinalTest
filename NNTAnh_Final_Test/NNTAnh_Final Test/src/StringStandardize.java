import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringStandardize {
    public static void main(String[] args) {
//        String str = "Hello!     world,  my%  %namE  IS,,  anh!! ";
//        System.out.println("Hello!     world,  my%  %namE  IS,,  anh!! ");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = keyboard.nextLine();

        capitalizeLetter(str);


    }

    public static void capitalizeLetter(String str) {
        str = str.trim();
        str = str.replaceAll("\\W", " ");

        StringTokenizer tokens = new StringTokenizer(str, " ");

        List<String> words = new ArrayList<>();

        while (tokens.hasMoreTokens()) {
            words.add(tokens.nextToken());
        }

        for (String word : words) {
            System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ");
        }

    }
}
