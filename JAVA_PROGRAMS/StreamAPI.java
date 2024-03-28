import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;

public class StreamAPI {
    public static void main(String[] args) {
        List <String> l = Arrays.asList("me1234","ee2345","cs4354","me1234","me1234");
        Stream<String> data = l.stream();
        String dept = "me";
        int i = (int)data.map(e->e.substring(0,2))
            .filter(e->e.equalsIgnoreCase(dept))
            .reduce(null);
        System.out.println(i);
        
    }
}
