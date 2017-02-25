import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Created by Владислав on 25.02.2017.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
     FileWorker fileWorker = new FileWorker();
        ArrayList arrayList;
        arrayList = fileWorker.read("Gaus.txt");
Selector  selector = new Selector(arrayList);
       selector.ReorgArray();
        System.out.println(arrayList.toString());

        selector.CountOfNumbers();
        fileWorker.write("ResultGaus.txt",selector.getMap());


    }
}
