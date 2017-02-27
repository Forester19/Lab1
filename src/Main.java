import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Created by Владислав on 25.02.2017.
 */
public class Main {
    static String filename = "Gaus.txt";
    static String fileResult = "ResultGaus.txt";

    public static void main(String[] args) throws FileNotFoundException {
        FileWorker fileWorker = new FileWorker();
        ArrayList arrayList;
        arrayList = fileWorker.readFile(filename);
        Selector selector = new Selector(arrayList);
        selector.ReorgArray();
        System.out.println(arrayList.toString());

        selector.CountOfNumbers();
        fileWorker.writeInFile(fileResult, selector.getMap());


    }
}
