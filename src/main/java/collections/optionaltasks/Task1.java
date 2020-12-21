package collections.optionaltasks;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * 1. Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
 */
public class Task1 {
    public static void main(String[] args) {
        String filePath = "S:\\tmp.txt";
        List<String> sentencesFromFile = Utils.getSentencesFromFile(filePath);
        try (FileWriter writer = new FileWriter(filePath,true)) {
            for (int i = sentencesFromFile.size() - 1; i >= 0; i--) {
                writer.append("\n");
                writer.append(sentencesFromFile.get(i));
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
