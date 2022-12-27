import java.util.Arrays;

public class task4 {
    public static void main(String[] args){
        System.out.println("------№1------");
        System.out.println(bessie(10,7,"hello my name is Bessie and this is my essay"));


        System.out.println("------№2------");
        System.out.println(Arrays.toString(split("()()()")));
        System.out.println(Arrays.toString(split("((()))")));
        System.out.println(Arrays.toString(split("((()))(())()()(()())")));


        System.out.println("------№3------");
        System.out.println(toCamelCase("get_Color"));
        System.out.println(toSnakeCase("helloEdabit"));
        System.out.println(toCamelCase("hello_edabit"));


        System.out.println("------№4------");
        System.out.println(overTime(new double[]{9,17,30,1.5}));
        System.out.println(overTime(new double[]{16, 18, 30, 1.8}));
        System.out.println(overTime(new double[]{13.25, 15, 30, 1.5}));


        System.out.println("------№5------");
        System.out.println(BMI("205 pounds", "73 inches"));
        System.out.println(BMI("55 kilos", "1.65 meters"));
        System.out.println(BMI("154 pounds", "2 meters"));


        System.out.println("------№6------");
        System.out.println(bugger(999));
        System.out.println(bugger(39));
        System.out.println(bugger(18));


        System.out.println("------№7------");
        System.out.println(toStarShorthand("abbccc"));
        System.out.println(toStarShorthand("abc"));
        System.out.println("");


        System.out.println("------№8------");
        System.out.println(doesRhyme("Sam I am!","Green eggs and ham."));
        System.out.println(doesRhyme("You are off to the races", "a splendid day."));
        System.out.println(doesRhyme("and frequently do?", "you gotta move."));


        System.out.println("------№9------");
        System.out.println(trouble(451999277, 477722899));
        System.out.println(trouble(1222345, 1222345));
        System.out.println(trouble(666789, 12345667));


        System.out.println("------№10------");
        System.out.println(countUniqueBooks("AZYWABBCATTTA", "A"));
        System.out.println(countUniqueBooks("ZZABCDEF", "Z"));
        System.out.println(countUniqueBooks("$AA$BBCATT$C$$B$", "$"));
    }

    public static String bessie(int n, int k, String essay) {
        String[] words = essay.split("\\s");
        int line = 0;
        StringBuilder content = new StringBuilder();

        for (int i = 0; i < n; i++) {
            line += words[i].length();
            if (line <= k)
                content.append(words[i]).append(" ");
            else {
                content = new StringBuilder(content.toString().trim() + "\n"
                        + words[i] + " ");
                line = words[i].length();
            }
        }
        return content.toString();
    }


    public static String[] split(String s) {
        int openBracket = 0;
        int closeBracket = 0;
        char[] brackets = s.toCharArray();
        StringBuilder content = new StringBuilder();

        for (char bracket : brackets) {
            if (bracket == '(') {
                openBracket++;
                content.append(bracket);
            } else if (bracket == ')') {
                closeBracket++;
                content.append(bracket);
            }
            if (openBracket == closeBracket) {
                content.append('\s');
            }
        }
        return content.toString().split("\\s");
    }

    public static String toCamelCase(String s) {
        String[] zak = s.split("_");
        StringBuilder content = new StringBuilder(zak[0]);
        for (int i = 1; i < zak.length; i++) {
            content.append(zak[i].substring(0, 1)
                    .toUpperCase()).append(zak[i].substring(1));
        }
        return content.toString();
    }


    public static String toSnakeCase(String s) {
        StringBuilder content = new StringBuilder();
        char[] zak = s.toCharArray();
        for (char c : zak) {
            if (String.valueOf(c).matches("[A-Z]")) {
                content.append("_");
            }
            content.append(String.valueOf(c).toLowerCase());
        }

        return content.toString();
    }


    public static String overTime(double[] schedule) {
        double startJob = schedule[0];
        double endJob = schedule[1];
        double loan = 0;
        if (endJob < 17 && endJob > 9) {
            loan += (endJob - startJob) * schedule[2];
        } else {
            if (endJob > 17) {
                loan += (17 - schedule[0]) * schedule[2];
                loan += (endJob - 17)
                        * schedule[2] * schedule[3];

            } else if (schedule[1] < 9) {

                loan += (endJob - 5)
                        * schedule[2] * schedule[3];
            }
            loan += (17 - startJob) * schedule[2];
        }
        return "$" + String.valueOf(loan);
    }


    public static String BMI(String weight, String height) {
        double bMI = 0;
        String content = "";
        String[] massa = weight.split(" ");
        String[] vysota = height.split(" ");
        bMI += Double.parseDouble(massa[0]);
        if (massa[1].equals("pounds"))
            bMI /= 2.205;
        bMI /= (Double.parseDouble(vysota[0])
                * Double.parseDouble(vysota[0]));
        if (vysota[1].equals("inches"))
            bMI *= 39.37 * 39.37;
        content += String.valueOf(bMI) + " ";
        if (bMI > 25)
            content += "Overweight";
        else if (bMI < 18.5)
            content += "Underweight";
        else
            content += "Normal weight";
        return content;
    }


    public static int bugger(int n) {
        int cal = 0;
        char[] numbers = String.valueOf(n).toCharArray();

        while (numbers.length > 1) {
            int a = 1;
            for (char number : numbers) a *= Integer.parseInt(String.valueOf(number));
            numbers = String.valueOf(a).toCharArray();
            cal += 1;
        }
        return cal;
    }


    public static String toStarShorthand(String word) {
        int cal = 1;
        StringBuilder content = new StringBuilder();
        word += (" ");
        char[] wordius = word.toCharArray();

        for (int i = 1; i < wordius.length; i++) {
            if (wordius[i] != wordius[i - 1]) {
                content.append(wordius[i - 1]);
                if (cal != 1)
                    content.append("*").append(String.valueOf(cal));
                cal = 1;
            } else
                cal += 1;
        }
        return content.toString();
    }


    public static boolean doesRhyme(String first, String second) {
        String[] endOfOne = first.split(" ");
        char[] endOne = endOfOne[endOfOne.length - 1].toLowerCase().toCharArray();
        String[] endOfTwo = second.split(" ");
        char[] endTwo = endOfTwo[endOfTwo.length - 1].toLowerCase().toCharArray();
        StringBuilder alpha = new StringBuilder();
        StringBuilder omega = new StringBuilder();

        for (char value : endOne) {
            if (String.valueOf(value).matches("[aeiouy]")) {
                alpha.append(value);
            }
        }

        for (char c : endTwo) {
            if (String.valueOf(c).matches("[aeiouy]")) {
                omega.append(c);
            }
        }
        return alpha.toString().equals(omega.toString());
    }


    public static boolean trouble(int first, int second) {
        char[] fNum = (String.valueOf(first) + " s").toCharArray();
        char[] sNum = (String.valueOf(second) + " s").toCharArray();
        char check = 'a';
        int cal1 = 1;
        int cal2 = 1;

        for (int i = 1; i < fNum.length; i++) {
            if (fNum[i - 1] == fNum[i]) {
                cal1 += 1;
                if (cal1 == 3) {
                    check = fNum[i];
                    cal1 = 1;
                }
            } else
                cal1 = 1;

        }

        for (int i = 1; i < sNum.length; i++) {
            if (sNum[i - 1] == sNum[i]) {
                cal2 += 1;
                if (cal2 == 2 && sNum[i] == check)
                    return true;
            }
        }
        return false;
    }


    public static int countUniqueBooks(String polka, String kniga) {
        char[] shelf = polka.toCharArray();
        int cal = 0;
        int f = 1;
        int uniqueBooks = 0;

        for (int i = 0; i < shelf.length - 1; i++) {
            if (shelf[i] == kniga.charAt(0)) {
                if (shelf[i] == shelf[i + 1]) {
                    f++;
                }
                if (f < 2) {
                    uniqueBooks++;
                }
            }

        }
        return uniqueBooks;
    }
}