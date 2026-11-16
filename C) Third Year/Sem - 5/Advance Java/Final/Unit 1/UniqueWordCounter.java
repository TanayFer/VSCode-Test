import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueWordCounter {
    public static void analyzeSentence(String sentence) {
        String[] words = sentence.toLowerCase().split("\\s+");
        Set<String> uniqueWords = new HashSet<>();
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            uniqueWords.add(word);
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Unique Words: " + uniqueWords);
        System.out.println("Word Frequencies: " + frequencyMap);
    }

    public static void main(String[] args) {
        analyzeSentence("Java programming is fun and programming in Java is powerful");
    }
}