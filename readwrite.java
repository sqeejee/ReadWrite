import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.imageio.IIOException;

//reads a file

public class readwrite {
    public readwrite(String inputFile) throws IOException {
        File file = new File(inputFile);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while ((reader.read()) != -1) {
        }
        reader.close();
    }

    // Asks for a file and a text string, writes the string into the file

    public void writeCode(String codeFile, String text) throws IOException {
        PrintWriter writer = new PrintWriter(codeFile);
        writer.println(text);
        writer.close();
    }
}
