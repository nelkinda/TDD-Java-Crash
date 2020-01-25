import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

public class Sort {
    public static void main(final String... args) {
        Stream
                .of(args)
                .map(Paths::get)
                .map(Sort::readAllLines)
                .flatMap(Collection::stream)
                .sorted()
                .forEach(System.out::println);
    }

    private static Collection<String> readAllLines(final Path path) {
        try {
            return Files.readAllLines(path);
        } catch (final IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
