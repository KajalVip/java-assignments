import java.util.LinkedHashMap;
import java.util.Map;

public class GroupOccurrenceOfCharacterAccordingToFirstAppearence {
    static void main(String[] args) {
        String str="occurrence";
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        StringBuilder result=new StringBuilder();
        for(Map.Entry<Character,Integer>entry:map.entrySet()){
            for(int i=0;i<entry.getValue();i++){
                result.append(entry.getKey());
            }
        }
        System.out.println(result);
       }
}
