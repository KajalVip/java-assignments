import java.util.LinkedHashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {

        String sentence = "Today is Monday and Today is sunny day";

        // Convert sentence into words
        String[] words = sentence.split(" ");

        // Store word count
        Map<String, Integer> frequencyMap = new LinkedHashMap<>();

        for (String word : words) {


            word = word.toLowerCase();

            if (frequencyMap.containsKey(word)) {
                frequencyMap.put(word, frequencyMap.get(word) + 1);
            } else {
                frequencyMap.put(word, 1);
            }
        }

        
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}