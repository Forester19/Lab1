import java.io.*;
import java.util.ArrayList;

/**
 * Created by Владислав on 25.02.2017.
 * Class what has working with text files
 */
public class FileWorker {

    public void writeInFile(String fileName, String text) {
        File fileInput = new File(fileName);
        PrintWriter out = null;

        try {
            if (!fileInput.exists()) {
                fileInput.createNewFile();
            }
            out = new PrintWriter(fileInput.getAbsoluteFile());
            out.print(text);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            out.close();
        }
    }

    public ArrayList readFile(String filename) throws FileNotFoundException {
        File fileOutput = new File(filename);
        ArrayList<Integer> arrayOfElements = new ArrayList<>();
        BufferedReader in = new BufferedReader(new FileReader(fileOutput.getAbsoluteFile()));
        String textLine;
        try {
            while ((textLine = in.readLine()) != null) {
                arrayOfElements.add(Integer.valueOf(textLine));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return arrayOfElements;
    }

}
