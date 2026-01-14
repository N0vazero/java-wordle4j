import org.junit.Test;
import ru.yandex.practicum.WordsPreparer;

import java.util.HashSet;

public class WordsPreparerTest {
    @Test
    public void filesWithWordsMustBeSame() {
        HashSet<String> dict1 = WordsPreparer.getDictionary();
        HashSet<String> dict2 = WordsPreparer.getDictionary();
        for (String word : dict1) {
            assert dict2.contains(word);
        }
    }
}
