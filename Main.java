import java.util.Scanner;

public class Main {

    private static String code;
    private static int codeLength;
    private static int getRandInt() {
        return (int) (Math.random() * 10);
    }

    /**
     * Complete the checkCode method to check the guess against the code
     * Print out the apppropriate messages
     * return true if the guess is correct
     * @param guess
     * @return
     */
    public static boolean checkCode(String guess) {
        return true;
    }// this checks it's the correct letter is in the right place
     //not that it's in the right place
        int correctChar = 0;
        for (int i = 0; i < code.charAt(); i++) {
            char check = guess.charAt(i);
            for (int i = 0; i < code.length(); i++) {
                if (check == code.charAt(i)) {
                    if (guess.charAt(i) == code.charAt(i)) {
                        correctChar += 1;
                    }
                }
            }
            //This checks it's correct and in the right place
            int correctRightOrder = 0
            for (int i = 0; i < code.Length (); i++) {
                if (code.charAt(i) == guess.charAt(i)) {
                    correctRightOrder += 1;
                }


    public static void main(String[] args) {
        System.out.println("Code cracker game");
        code = "";
        //Write the code to set the length of the code here
        Scanner scanner = new Scanner(System.in);
        int codeLength = 0;

        //Write the code to set up the candon code to crack here
        //Write code for main loop here
        System.out.println("Enter the length of the code you want to crack: ");
        codeLength = scanner.nextInt();
        for (int i = 0; i < codeLength; i++)
                code += getRandInt();
        while (true) {
            System.out.println(String.format("Code length is %d. Enter your guess: ", codeLength));

        String guess = "";
            do{
                guess = scanner.nextLine();
            } while (guess == null || guess.isEmpty());

            System.out.println("Your guess: " + guess);
            if (guess.length() != codeLength) {
                System.out.println(String.format("Invalid guess length %d. Try again.", guess.length()));
            } else {
                if (checkCode(guess)) {
                    System.out.println("Congratulations! You cracked the code!");
                    break;
                }
            }
        }
 }   }}