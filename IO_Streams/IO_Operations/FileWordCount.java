import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class FileWordCount {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: java FileWordCount inputFile.txt outputFile.txt");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        TreeMap<String, Integer> wordCount = new TreeMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(inputFile));

            String line;

            while ((line = br.readLine()) != null) {

                String[] words = line.split("\\s+");

                for (String word : words) {

                    if (word.length() == 0)
                        continue;

                    if (wordCount.containsKey(word)) {
                        wordCount.put(word, wordCount.get(word) + 1);
                    } else {
                        wordCount.put(word, 1);
                    }
                }
            }

            br.close();

            PrintWriter pw = new PrintWriter(new FileWriter(outputFile));

            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                pw.println(entry.getKey() + " : " + entry.getValue());
            }

            pw.close();

            System.out.println("Word count written to " + outputFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}