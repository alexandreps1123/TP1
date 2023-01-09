package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        String pathIn = "src/in.csv";

        Map<String, Integer> candidates = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(pathIn))) {
            String line = br.readLine();

            while(line != null) {
                String[] content = line.split(",");

                if (!candidates.containsKey(content[0])) {
                    candidates.put(content[0], Integer.parseInt(content[1]));
                }
                else {
                    Integer value = candidates.get(content[0]) + Integer.parseInt(content[1]);

                    candidates.put(content[0], value);
                }

                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

        for (String key: candidates.keySet()) {
            System.out.println(key + ": " + candidates.get(key));
        }
    }
}