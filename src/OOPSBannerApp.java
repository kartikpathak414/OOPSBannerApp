import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, CharacterPattern> patternMap = CharacterPatternMap.getPatterns();

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                line.append(patternMap.get(ch).getPattern()[i]);
            }

            System.out.println(line);
        }
    }

    // Class to hold character pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Class to manage all patterns
    static class CharacterPatternMap {

        public static Map<Character, CharacterPattern> getPatterns() {

            Map<Character, CharacterPattern> map = new HashMap<>();

            map.put('O', new CharacterPattern('O', new String[]{
                    " *****   ",
                    "*     * ",
                    "*     * ",
                    "*     * ",
                    "*     * ",
                    "*     * ",
                    " *****   "
            }));

            map.put('P', new CharacterPattern('P', new String[]{
                    " *****   ",
                    "*     * ",
                    "*     * ",
                    " *****   ",
                    "*       ",
                    "*       ",
                    "*       "
            }));

            map.put('S', new CharacterPattern('S', new String[]{
                    " ***** ",
                    "*     *",
                    "*      ",
                    " ***** ",
                    "      *",
                    "*     *",
                    " ***** "
            }));

            return map;
        }
    }
}