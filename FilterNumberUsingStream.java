import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNumberUsingStream {
    static void main(String[] args) {
        List<Integer> list= Arrays.asList(9,7,3,4,1,3,0);
        List<Integer>result=list.stream().filter(n->n<5).toList();
        System.out.println(result);
    }
}
