import java.util.*;

public class CheckInp {
    private String inputString;

    public CheckInp(String inputString) {
        this.inputString = inputString;
    }

    public Map<String, Integer> makeMap() {
        Set<String> setInput = new HashSet<String>();
        List<String> arrlist = new ArrayList<String>();

        //set is used to gather non-repeated items, list is used to have all items like input
        for (String st : inputString.split(" ")) {
            arrlist.add(st);
            setInput.add(st);
        }

        Map<String, Integer> results = new TreeMap<>();
        // we start to count item and add their information in a map
        Iterator<String> itStr = setInput.iterator();
        for (int i = 0; i < setInput.size(); i++) {
            String key = itStr.next();
            results.put(key, Collections.frequency(arrlist, key));
        }
        return results;
    }

    public <K, V extends Comparable<V>> TreeMap<K, V> sortMap(final Map<K, V> map) {
        Comparator<K> valueComparator = new Comparator<K>() {
            public int compare(K k1, K k2) {
                int comp = map.get(k1).compareTo(
                        map.get(k2));
                if (comp == 0)
                    return 1;
                else
                    return comp;
            }
        };

        TreeMap<K, V> sorted = new TreeMap<K, V>(valueComparator);
        sorted.putAll(map);
        return sorted;
    }

    public void checkRunner() {
        Map<String, Integer> mapInp = makeMap();
        TreeMap<String, Integer> resultMap = sortMap(mapInp);
        for (int i = 0; i < 3; i++) {
            System.out.println(resultMap.pollLastEntry());
        }
    }
}
