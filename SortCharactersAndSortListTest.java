import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

 class SortCharactersAndSortList {

        public static String sortCharacters(String a){
            char[]arr=a.toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        }
        public static List<String> sortList(List<String>b){
           Collections.sort(b);
           return b;
        }

   }

public class SortCharactersAndSortListTest{
    @Test
     public void testSortCharacter(){
        String input="asbzd";
        String result=SortCharactersAndSortList.sortCharacters(input);
        Assert.assertEquals("abdsz",result);
    }
    @Test
     public void testSortList(){
        List<String>input=Arrays.asList("Mango", "Apple", "Banana" );
        List<String>result=SortCharactersAndSortList.sortList(input);
        List<String>expected=Arrays.asList("Apple","Banana","Mango");
        Assert.assertEquals(expected,result);
    }


}
