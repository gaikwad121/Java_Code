package programs_Practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class program5 {

	// occurance of a each character
	public static void occuranceChar(String str) {
        char[] ch = str.toCharArray();
        
        Map<Character, Integer> map = new LinkedHashMap<>(); // preserve order

        for (char ch2 : ch) {
            map.put(ch2, map.getOrDefault(ch2, 0) + 1); // count update
        }

        StringBuilder sb = new StringBuilder();
        for (char ch3 : map.keySet()) {
            sb.append(ch3).append(" → ").append(map.get(ch3)).append("\n"); // print format
        }

        System.out.println(sb.toString()); // final output
    }

}

