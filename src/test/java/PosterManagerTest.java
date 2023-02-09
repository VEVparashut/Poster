import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void test() {
        PosterManager manager = new PosterManager();

        manager.add("Фильм 1");
        manager.add("Фильм 2");
        manager.add("Фильм 3");

        String[] expected = { "Фильм 1", "Фильм 2", "Фильм 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        PosterManager manager = new PosterManager();

        manager.add("Фильм 1");
        manager.add("Фильм 2");
        manager.add("Фильм 3");

        String[] expected = { "Фильм 1", "Фильм 2", "Фильм 3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
