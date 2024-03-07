import java.io.*;

public class PrzeksztalcaniePliku {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Podaj nazwę pierwszego pliku: ");
            String inputFile = reader.readLine();

            System.out.print("Podaj nazwę drugiego pliku: ");
            String outputFile = reader.readLine();

            try (BufferedReader fileReader = new BufferedReader(new FileReader(inputFile));
                 PrintWriter fileWriter = new PrintWriter(new FileWriter(outputFile))) {

                String line;
                while ((line = fileReader.readLine()) != null) {
                    fileWriter.println(line.toUpperCase());
                }
            } catch (IOException e) {
                System.out.println("Wystąpił błąd podczas czytania lub zapisywania pliku: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas wprowadzania danych: " + e.getMessage());
        }
    }
}
