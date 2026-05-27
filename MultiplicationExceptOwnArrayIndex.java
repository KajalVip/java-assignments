//Input: [1, 2, 3, 4]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Output: [24, 12, 8, 6]
public class MultiplicationExceptOwnArrayIndex {
    public static void main(String[] args) {
        List<Integer> al=new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> result=new ArrayList<>();
        for (int i=0;i<al.size();i++){
            int product=1;
            for (int j=0;j<al.size();j++){
                if(i!=j){
                    product=product*al.get(j);
                }
            }
            result.add(product);
        }
        System.out.println(result);


    }
}
