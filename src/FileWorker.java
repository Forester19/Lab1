import java.io.*;
import java.util.ArrayList;

/**
 * Created by Владислав on 25.02.2017.
 */
public class FileWorker {

    public void write(String fileName, String text){
        File file = new File(fileName);
        PrintWriter out = null;

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            out = new PrintWriter(file.getAbsoluteFile());
            out.print(text);
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                out.close();
            }
        }
        public ArrayList read(String filename) throws FileNotFoundException {
        File file1 = new File(filename);
        ArrayList<Integer> mas = new ArrayList<>();
            BufferedReader in = new BufferedReader(new FileReader(file1.getAbsoluteFile()));
            String s;
            try {
                while ((s=in.readLine()) != null){
                    mas.add(Integer.valueOf(s));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return mas;
        }

}
