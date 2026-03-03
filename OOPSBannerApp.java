import java.util.*;

public class OOPSBannerApp {

    // Centralized Map for character patterns
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        patternMap.put('O', new String[]{
                "OOOO",
                "O  O",
                "O  O",
                "O  O",
                "OOOO"
        });

        patternMap.put('P', new String[]{
                "PPPP",
                "P  P",
                "PPPP",
                "P   ",
                "P   "
        });

        patternMap.put('S', new String[]{
                "SSSS",
                "S   ",
                "SSSS",
                "   S",
                "SSSS"
        });
    }

    public static void main(String[] args) {
        renderBanner("OOPS");
    }

    // Separate function for rendering
    public static void renderBanner(String word) {

        for (int row = 0; row < 5; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    line.append(pattern[row]).append("   ");
                }
            }

            System.out.println(line);
        }
    }
}
