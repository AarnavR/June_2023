package reactiongame;

import java.util.Scanner;

public class ReactionGame {
    public static void main(String[] args) throws InterruptedException{

        System.out.println("Rewrite the following word text: \n 'According to the National Center for Voice and Speech, the average conversation rate for English speakers in the United States is about 150 wpm.' ");
        Thread.sleep(1000);
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the text: ");
        final long startTime = System.currentTimeMillis();
        String text = scanner.nextLine();
        if (text.equals("According to the National Center for Voice and Speech, the average conversation rate for English speakers in the United States is about 150 wpm.")){
            final long endTime = System.currentTimeMillis();
            System.out.println("You took " + ((double)endTime - (double)startTime)/ ((double)1000 * 24) + " seconds per each word");
        } else {
            System.out.println("You mispelled something :( )");
        }

    }
}
