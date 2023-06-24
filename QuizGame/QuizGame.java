package QuizGame;

import java.util.Scanner;

public class QuizGame {
    static int question_counter = 0;
    static int question(String question, String answer){
        question_counter += 1; 
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        System.out.print("Enter a character: ");
        String user_answer = scanner.nextLine();

        if (user_answer.equals(answer)){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args){
        int correct_ans_sum = 0;
        correct_ans_sum += question("1. What is the longest that an elephant has ever lived? (That we know of) \n A: 17 years \n B: 49 years \n C: 86 years \n D: 142 years", "C");
        correct_ans_sum += question("2. Who killed Greedo (Star Wars) ?  \n A: Hannibal \n B: Han Solo \n C: Hercules \n D: Hermione", "B");
        correct_ans_sum += question("3. Which of these is NOT a type of boat? \n A: Catamaran \n B: Dungaree \n C: Galleon \n D: Junk", "B");
        System.out.println();
        System.out.println("Your accuracy score was: " +  100 * ((double)correct_ans_sum / (double)question_counter) + " percent");

    }
}
