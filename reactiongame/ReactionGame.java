package reactiongame;

import java.util.Scanner;

public class ReactionGame {
    public static void main(String[] args) throws InterruptedException{


        final long startTime = System.currentTimeMillis();

        System.out.println("Rewrite the following word below: 'purple' ");
        Thread.sleep(1000);
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the text: ");
        String text = scanner.nextLine();
        if (text.equals("purple")){
            final long endTime = System.currentTimeMillis();
            System.out.println("You took " + ((double)endTime - (double)startTime)/ (double)1000 + " seconds to write the word");
        } else {
            System.out.println("You mispelled the word :(");
        }

    }
}
