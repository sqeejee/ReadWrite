import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

// Reads a file
public class readwrite {
    public String read(String inputFile) throws IOException {
        String str = "";
        File file = new File(inputFile);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while ((line = reader.readLine()) != null) {
            str += line;
        }
        reader.close();
        return str;
    }

    // Asks for a file and a text string, writes the string into the file
    public void write(String codeFile, String text) throws IOException {
        try (PrintWriter writer = new PrintWriter(codeFile)) {
            writer.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // public static void main(String[] args) {
    // try {
    // readwrite rw = new readwrite("input.txt");
    // rw.writeCode("output.txt", "aidan rahill is my baby boy i love him");
    // } catch (IOException e

    public int countCharacters(String fileName) throws IOException {
        int count;
        try {
            count = read(fileName).length();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            count = 0;
        }
        return count;
    }
}
