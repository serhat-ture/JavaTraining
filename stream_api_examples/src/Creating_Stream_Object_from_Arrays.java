import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;

public class Creating_Stream_Object_from_Arrays {
    public static void main(String[] args) throws IOException {

        // Array can also be a source of a Stream
        Stream<String> streamOfArray = Stream.of("a", "b", "c");
        streamOfArray.forEach(System.out::println);

        // creating from existing array or of a part of an array:
        String[] arr = new String[] { "a", "b", "c" };
        Stream<String> streamOfArrayFull = Arrays.stream(arr);
        streamOfArrayFull.forEach(System.out::println);

        Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
        streamOfArrayPart.forEach(System.out::println);
    }
}
