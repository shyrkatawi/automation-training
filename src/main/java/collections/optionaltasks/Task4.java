package collections.optionaltasks;

import java.util.Comparator;
import java.util.List;

/**
 * 4. Занести стихотворение в список. Провести сортировку по возрастанию длин строк.
 */
public class Task4 {
    public static void main(String[] args) {
        String filePath = "S:\\tmp.txt";
        List<String> sentencesFromFile = Utils.getSentencesFromFile(filePath);
        sentencesFromFile.sort(Comparator.comparingInt(String::length));
    }
}
