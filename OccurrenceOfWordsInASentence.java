import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfWordsInASentence {
    static void main(String[] args) {
        String sample="Java is easy , java is powerful , Java .";
        sample=sample.toLowerCase();
        String[]arr=sample.split(" ");
        Map<String,Integer> result=new HashMap<>();
        for(String word:arr){
             result.put(word,result.getOrDefault(word,0)+1);

        }
        System.out.println(result);


    }
}
