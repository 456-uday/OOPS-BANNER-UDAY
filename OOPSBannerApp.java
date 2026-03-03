import java.util.*;

public class OOPSBannerApp {

    // Static Inner Class to store character and pattern
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter methods
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Map to store all character patterns
        Map<Character, CharacterPattern> patternMap = new HashMap<>();

        // Add O pattern
        patternMap.put('O', new CharacterPattern('O', new String[]{
                "OOOO",
                "O  O",
                "O  O",
                "O  O",
                "OOOO"
        }));

        // Add P pattern
        patternMap.put('P', new CharacterPattern('P', new String[]{
                "PPPP",
                "P  P",
                "PPPP",
                "P   ",
                "P   "
        }));

        // Add S pattern
        patternMap.put('S', new CharacterPattern('S', new String[]{
                "SSSS",
                "S   ",
                "SSSS",
                "   S",
                "SSSS"
        }));

        String word = "OOPS";

        // Print banner horizontally
        for (int row = 0; row < 5; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                CharacterPattern cp = patternMap.get(ch);
                if (cp != null) {
                    line.append(cp.getPattern()[row]).append("   ");
                }
            }

            System.out.println(line);
        }
    }
}