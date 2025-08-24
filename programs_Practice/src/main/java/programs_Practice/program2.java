package programs_Practice;

import java.util.HashSet;
import java.util.Set;

public class program2 {
// Print duplicate char
public static void duplicateChar(char[] ch, String str) {
    ch = str.toCharArray();
    StringBuilder sb = new StringBuilder();
    Set<Character> printed = new HashSet<>();

    for (int i = 0; i < ch.length; i++) {
        boolean repeated = false;
        for (int j = i + 1; j < ch.length; j++) {
            if (ch[i] == ch[j]) {
                repeated = true;
                break;
            }
        }
        if (repeated && !printed.contains(ch[i])) {
            sb.append(ch[i]);
            printed.add(ch[i]);
        }
    }

    System.out.println("Repeated characters: " + sb.toString());
}
}