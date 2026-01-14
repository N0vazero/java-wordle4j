import org.junit.Test;
import ru.yandex.practicum.GameProcess;
import ru.yandex.practicum.WordsPreparer;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class GameProcessTest extends GameProcess {
    private static HashSet<String> dict = WordsPreparer.getDictionary();;
    private static GameProcess gameProcess;

    public GameProcessTest() {
        super(dict);
    }

    @Test
    public void tipTest() {
        targetWord = "перец";
        String word = "пицца";
        assertEquals(getTip(word), "+-^^-");

    }
}
