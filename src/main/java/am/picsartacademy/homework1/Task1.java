package am.picsartacademy.homework1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;


public class Task1 {
// 1.	Word Counter
//	•	Read a sentence from the console.
//  •	Count the frequency of each word using a HashMap<String, Integer>.
    public static void main(String[] args) {
        String text = "Anna Mane Hayk David Ani Anna Tigran Hayk Anna";

        String[] words = text.split(" ");
        Stream.of(words).forEach(a -> System.out.println(a));
        Map<String, Integer> countsMap = new HashMap<>();
        
        for(String anyVar: words) {
            if (countsMap.get(anyVar) == null) {
                countsMap.put(anyVar, 1);
            }else {
                int currentCount = countsMap.get(anyVar);
                countsMap.put(anyVar, currentCount + 1);
            }
        }
        System.out.println(countsMap);
        System.out.println(new TreeMap<> (countsMap));
    }
}
