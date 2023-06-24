package stringreversal;
import java.util.*;


public class Stringreversal {
    static String reverse(String in){
        String s = "";
        for (int i = 0; i < in.length(); i++){
            s += in.charAt(in.length() - i - 1);
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String str = scanner.nextLine();
        System.out.println(reverse(str));
    }
}
