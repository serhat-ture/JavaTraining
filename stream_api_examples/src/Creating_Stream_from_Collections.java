import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Creating_Stream_from_Collections {
    public static void main(String[] args) throws IOException {

        Collection<String> collection = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
        Stream<String> stream2 = collection.stream();
        stream2.forEach(System.out::println);

        System.out.println("**********************");

        List<String> list = Arrays.asList("JAVA", "J2EE", "Spring", "Hibernate");
        Stream<String> stream3 = list.stream();
        stream3.forEach(System.out::println);

        System.out.println("**********************");

        Set<String> set = new HashSet<>(list);
        Stream<String> stream4 = set.stream();
        stream4.forEach(System.out::println);
    }
}