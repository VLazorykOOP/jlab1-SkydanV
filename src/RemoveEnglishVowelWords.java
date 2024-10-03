import java.util.Scanner;

public class RemoveEnglishVowelWords {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter your text:");
        String text = scanner.nextLine();
        
       
        String vowels = "aeiouAEIOU";
        
       
        String[] words = text.split("[\\s\\p{Punct}]+");

        
        StringBuilder resultText = new StringBuilder();

        
        for (String word : words) {
            
            if (word.length() > 0 && !vowels.contains(Character.toString(word.charAt(0)))) {
                resultText.append(word).append(" ");
            }
        }

        
        System.out.println("Text without words starting with a vowel:");
        System.out.println(resultText.toString().trim());

        
        scanner.close();
    }
}
