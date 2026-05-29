import java.util.HashSet;

public class GroupedWordCheck {
    public static boolean checkWord(String str){
        HashSet<Character>set=new HashSet<>();
        char prev=str.charAt(0);
        set.add(prev);
        for (int i=1;i<str.length();i++){
            char curr=str.charAt(i);
            while(curr!=prev){
            if(set.contains(curr)){
                return false;
            }
            set.add(curr);
            prev=curr;
        }
    }return true;
    }
    static void main(String[] args) {
        //GroupedWordCheck gw=new GroupedWordCheck();
        System.out.println(checkWord("aabbcb"));
        System.out.println(checkWord("aabcc"));


    }
}
