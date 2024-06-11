import java.util.Arrays;
import java.util.List;

public class practice_set {
        

    public static void main(String[] args) {
        List<Integer> op = Arrays.asList(10,20,30,40,50,60);
        List<Integer> ans = op.stream().sorted().collect(Collectors.toList());
        System.out.println(ans);
    }
}
