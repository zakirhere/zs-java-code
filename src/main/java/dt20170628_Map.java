import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by zakirsay on 6/28/17.
 */
public class dt20170628_Map {
    public static void main(String[] args) {
        HashMap<String, String> hMap = new HashMap<String, String>();
        hMap.put("p1", "param1");
        hMap.put("p2", "param2");
        hMap.put("p3", "param3");
//        System.out.println(hMap);
        hmapIterator(hMap);

    }

    public static void hmapIterator(HashMap myMap) {
//        System.out.println(myMap);
        Iterator iterator = myMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry me2 = (Map.Entry) iterator.next();
            System.out.println("Key: "+me2.getKey() + " & Value: " + me2.getValue());
        }
    }
}
