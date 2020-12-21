package collections.optionaltasks;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 8. Задан файл с текстом на английском языке.
 * Выделить все различные слова.
 * Слова, отличающиеся только регистром букв, считать одинаковыми.
 * Использовать класс HashSet.
 */
public class Task8 {
    public static void main(String[] args) {
        String filePath = "S:\\tmp.txt";
        List<String> sentencesFromFile = Utils.getSentencesFromFile(filePath);
        Set<String> wordsSet = new HashSet<>();
        for (String sentence : sentencesFromFile) {
            String[] strings = sentence.split("[\\W]+");
            for (String str : strings) {
                wordsSet.add(str.toLowerCase());
            }
        }
    }
}
