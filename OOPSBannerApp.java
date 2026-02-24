public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {

            String.join("   ", printO(1), printO(1), printP(1), printS(1)),
            String.join("   ", printO(2), printO(2), printP(2), printS(2)),
            String.join("   ", printO(3), printO(3), printP(3), printS(3)),
            String.join("   ", printO(4), printO(4), printP(4), printS(4)),
            String.join("   ", printO(5), printO(5), printP(5), printS(5))

        };

        for (String line : banner) {
            System.out.println(line);
        }
    }

    static String printO(int line) {
        switch(line) {
            case 1:
            case 5: return "OOOO";
            case 2:
            case 3:
            case 4: return "O  O";
        }
        return "";
    }

    static String printP(int line) {
        switch(line) {
            case 1: return "PPPP";
            case 2:
            case 3: return "P  P";
            case 4:
            case 5: return "P   ";
        }
        return "";
    }

    static String printS(int line) {
        switch(line) {
            case 1: return "SSSS";
            case 2: return "S   ";
            case 3: return "SSS ";
            case 4: return "   S";
            case 5: return "SSSS";
        }
        return "";
    }
}