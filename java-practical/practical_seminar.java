import java.util.*;

public class practical_seminar {
        
    /**
     * Creates a new instance of <code>practical_seminar</code>.
     */
    public practical_seminar() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> op = Array.asList("ashwin","Sneh","Hem","Dhruv");
        op.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println(ans);
    }
}
