import java.util.*;

/**
 * Created by Владислав on 25.02.2017.
 */
public class Selector {
    private ArrayList<Integer> arrayList = new ArrayList<>();
    Map<Integer,Integer> map = new HashMap<>();

    private  int count = 0;
    public Selector(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }
    public void ReorgArray(){
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

    }
    public void CountOfNumbers(){
     for (int i:arrayList){
         map.put(i,map.containsKey(i)?map.get(i)+1:1);
     }
    }
    public String getMap(){
        return map.toString();
    }
}
