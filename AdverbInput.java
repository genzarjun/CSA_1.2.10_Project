import java.util.Scanner;

// AdverbInput: asks the user for an adverb and returns it
public class AdverbInput
{
    public String getWord(Scanner input)
    {
        // ouputs instructions
        System.out.print("Enter an adverb: ");
        String word = input.nextLine(); // this line will take the input
        return word; // returns word to main class
    }
}
