package collections.optionaltasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {
    public static void main(String[] args) {
        String filePath = "S:\\tmp.txt";
        System.out.println(getSentencesFromFile(filePath).toString());
    }

    static List<String> getSentencesFromFile(String filePath) {
        List<String> sentencesList = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                sentencesList.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sentencesList;
    }
}
