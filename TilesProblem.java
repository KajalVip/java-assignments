import java.util.HashMap;
import java.util.Map;

public class TilesProblem {
    public static boolean check(String str){
        Map<Character,Integer> map=new HashMap<>();
        for (char c:str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int pairCount=0;
        for(int a:map.values()){
            if(a%3==0){
                continue;
            }
            if(a%3==2){
                pairCount++;
            }
            else{
                return false;
            }
        }
        return pairCount==1;
    }

    static void main(String[] args) {
        String[] testCases = {
                "11133555",
                "111333555",
                "00000111",
                "13233121",
                "11223344555"
        };
        for(String s:testCases){
            System.out.println(s+"->"+check(s));
        }

    }
}
