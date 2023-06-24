package pattern;

import java.util.*;
public class SymbolArt {

    static void symbolArtist(String pattern_char, int pattern_count){
        for (int r = 0; r < pattern_count; r ++){
            for (int c = 0; c <= r; c ++) {
                System.out.print(pattern_char);
            }
            System.out.println();
        }

        for (int r = pattern_count - 1; r > 0 ; r--){
            for (int c = 0; c < r; c ++) {
                System.out.print(pattern_char);
            }
            System.out.println();
        }

    }

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String pattern_char = scanner.nextLine();

        System.out.print("Enter a number: ");
        int pattern_count = scanner.nextInt();

        symbolArtist(pattern_char, pattern_count);
    }
}
