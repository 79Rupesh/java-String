public class S6 {
    public static int value(char s) {
        if (s == 'I') {
            return 1;
        } else if (s == 'V') {
            return 5;

        } else if (s == 'X') {
            return 10;
        } else if (s == 'C') {
            return 100;
        } else if (s == 'D') {
            return 500;
        } else {
            return 1000;
        }
    }

    public static void main(String[] args) {
        String s = "MCMIV";
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = value(s.charAt(i));
            if (i < s.length() - 1 && current < value(s.charAt(i + 1))) {
                result = result - current;
            } else {
                result = result + current;

            }

        }
        System.out.println(result);
    }
}