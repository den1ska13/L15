import java.util.*;

public class Bd {
    Map<String,String> BdStr = new LinkedHashMap<>(0);



    public void add(String s){
        BdStr.put(s,s);

    }

    public void delete(String s){
        BdStr.remove(s);

    }

    public void print(){

        Iterator<String> itr = BdStr.values().iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }

    public void apdate (String s, String sn){
        BdStr.remove(s);
        BdStr.put(sn,sn);
    }

    public void sort() {
        ArrayList a = new ArrayList();
        a.addAll(BdStr.values());
        MyComparator comparator = new MyComparator();
        a.sort(comparator);
        System.out.println(a.toString());
    }
}
