import java.util.*;

public class RepeatingCharacters {
    public static void main(String[] args) {
        String s = "ACCOMODATION";

        Map<Character, List<Integer>> charIndices = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            charIndices.putIfAbsent(ch, new ArrayList<>());
            charIndices.get(ch).add(i);
        }

        System.out.println("Repeating characters and their indices:\n");
        for (Map.Entry<Character, List<Integer>> entry : charIndices.entrySet()) {
            if (entry.getValue().size() > 1) {
                System.out.println("'" + entry.getKey() + "' -> indices: " + entry.getValue());
            }
        }
    }
}
