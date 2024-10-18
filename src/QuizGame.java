import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {

        System.out.println("Hello and welcome to the amazing quiz game!");
        System.out.println("Please choose a category to start with by typing a number from 1-4.");

        Scanner reader = new Scanner(System.in);

        byte choice = reader.nextByte();

        switch (choice) {

            case 1:
                System.out.println("Science!");
                System.out.println("For one point, answer what the cell membrane's function is.");
                String answer = reader.nextLine();
                answer = reader.nextLine();
                if (answer.equals("It acts like a border")){
                    System.out.println("Correct! You get one point.");
                }
                else {
                    System.out.println("Incorrect. The correct answer is that it serves as a border!");
                }
                break;

            case 2:
                System.out.println("History!");
                System.out.println("When was the 3th of September?");
                answer = reader.nextLine();
                answer = reader.nextLine();
                if (answer.equals("The 3th of September")){
                    System.out.println("Correct! You get one point.");
                }
                else {
                    System.out.println("Incorrect. The correct answer is the 3rd of September!");
                }
                break;

            case 3:
                System.out.println("Games!");
                System.out.println("How were combos in fighting games invented?");
                answer = reader.nextLine();
                answer = reader.nextLine();
                if (answer.equals("They were a bug in Street Fighter 2")){
                    System.out.println("Correct! You get one point.");
                }
                else {
                    System.out.println("Incorrect. The correct answer is that they were a bug in Street Fighter 2");
                }
                break;

            case 4:
                System.out.println("Sports");
                System.out.println("What is the thing you hit tennis balls with called?");
                answer = reader.nextLine();
                answer = reader.nextLine();
                if (answer.equals("A racket")){
                    System.out.println("Correct! You get one point.");
                }
                else {
                    System.out.println("Incorrect. The correct answer is a racket!");
                }
                break;

            default:
                System.out.println("Invalid category choice. Bro choose a valid category. I don't like you.");
                break;
        }
    }
}


