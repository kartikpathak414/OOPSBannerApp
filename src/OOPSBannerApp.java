import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Get pattern map
        Map<Character, String[]> patternMap = getPatternMap();

        String word = "OOPS";

        // Loop through each row
        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            // Loop through each character in word
            for (char ch : word.toCharArray()) {

                // Get pattern using HashMap (fast lookup)
                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[i]);
                }
            }

            System.out.println(line);
        }
    }

    // Method to create HashMap
    public static Map<Character, String[]> getPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        // Pattern for O
        map.put('O', new String[]{
                " *****   ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****   "
        });

        // Pattern for P
        map.put('P', new String[]{
                " *****   ",
                "*     * ",
                "*     * ",
                " *****   ",
                "*       ",
                "*       ",
                "*       "
        });

        // Pattern for S
        map.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        return map;
    }
}