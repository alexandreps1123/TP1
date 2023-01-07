package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        // ler um arquivo .csv
        // gerar summary.csv
        // localizado em uma subpasta "out"
        // contendo nome e valor total (quantidade * valor unitário)

        String pathIn = "src/in.csv";
        String pathOut = "src/summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(pathIn))) {
            String line = br.readLine();

            boolean success = new File("src/out").mkdir();

            if (success) {
                pathOut = "src/out/summary.csv";
            }

            while(line != null) {
                String[] content = line.split(",");

                System.out.printf(content[0] + content[1] + "\n");
                line = br.readLine();

                try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut, true))) {
                    double subTotal = Double.valueOf(content[1].trim()) * Double.valueOf(content[2].trim());

                    String outputLine = "" + content[0] + ", " + subTotal;

                    bw.write(outputLine);
                    bw.newLine();
                    
                }
                catch (IOException e){
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}