import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        System.out.println("------№1------");
        System.out.println(repeat("Hello", 3));
        System.out.println(repeat("Nice", 5));
        System.out.println(repeat("Stop", 1));


        System.out.println("------№2------");
        System.out.println(differenceMaxMin(new int[]{1,3,54,6,7,13}));
        System.out.println(differenceMaxMin(new int[]{15,3,5,24,-6,-10,0}));
        System.out.println(differenceMaxMin(new int[]{100,-99,2,457,-200}));


        System.out.println("------№3------");
        System.out.println(isAvgWhole(new int[]{1,3}));
        System.out.println(isAvgWhole(new int[]{5,1,3,5,6,10}));
        System.out.println(isAvgWhole(new int[]{14,34,2,1}));


        System.out.println("------№4------");
        System.out.println(Arrays.toString(cumulativeSum(new int[]{1,2,4,5})));
        System.out.println(Arrays.toString(cumulativeSum(new int[]{1,2,12,45})));
        System.out.println(Arrays.toString(cumulativeSum(new int[]{1,4,12,20})));


        System.out.println("------№5------");
        System.out.println((int)getDecimalPlaces("43.20"));
        System.out.println((int)getDecimalPlaces("23.222"));
        System.out.println((int)getDecimalPlaces("100"));


        System.out.println("------№6------");
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(10));


        System.out.println("------№7------");
        System.out.println(isValid("134 43342"));
        System.out.println(isValid("853a7"));
        System.out.println(isValid("13442"));


        System.out.println("------№8------");
        System.out.println(isStrangePair("mother", "rum"));
        System.out.println(isStrangePair("bush", "hubris"));
        System.out.println(isStrangePair("", ""));


        System.out.println("------№9------");
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isPrefix("retrospect", "sub-"));

        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(isSuffix("vocation", "-logy"));

        System.out.println("------№10------");
        System.out.println(boxSeq(1));
        System.out.println(boxSeq(4));
        System.out.println(boxSeq(9));
    }

    public static String repeat(String string, int num){
        String newString = "";
        for (int i = 0; i < string.length(); i++){
            int k = num;
            while (k != 0) {
                newString += string.charAt(i);
                k -= 1;
            }
        }
        return newString;
    }

    public static int differenceMaxMin(int[] list){
        int min = list[0];
        int max = list[0];
        for(int n: list){
            if(n < min){
                min = n;
            }
            if(n > max){
                max = n;
            }
        }
        return max - min;
    }

    public static boolean isAvgWhole(int[] list){
        int n = list.length;
        double listSum = 0;
        for(int num: list){
            listSum += num;
        }
        return listSum % n == 0;
    }

    public static int[] cumulativeSum(int[] list){
        int[] newList = new int[list.length];
        int a = 0;

        for (int i = 0; i < list.length; i++) {
            a += list[i];
            newList[i] = a;
        }
        return newList;
    }

    public static int getDecimalPlaces(String string){
        char[] charList = string.toCharArray();
        int c = 0;
        for (int i = 0; i < charList.length; i++) {
            if (charList[i] == ".".charAt(0)) {
                c = i;
                break;
            }
        }
        if (c == 0) {
            return 0;
        }
        else return charList.length - (c + 1);
    }

    public static int fibonacci(int num){
        int firstNum = 0;
        int secondNum = 1;
        int sum = 0;
        for(int i = 0; i < num; i++){
            sum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = sum;
        }
        return sum;
    }

    public static boolean isValid(String string){
        if (string.length() != 5)
            return false;
        for(int i = 0; i < string.length(); i++){
            char letter = string.charAt(i);
            if(!Character.isDigit(letter)){
                return false;
            }
        }
        return true;
    }

    public static boolean isStrangePair(String firstString, String secondString){
        if(firstString == "" && secondString == "")
            return true;
        return firstString.charAt(0) == secondString.charAt(secondString.length() - 1) && firstString.charAt(firstString.length() - 1) == secondString.charAt(0);
    }

    public static boolean isPrefix(String word, String prefix){
        return word.startsWith(prefix.replace("-", "")) == true;
    }

    public static boolean isSuffix(String word, String suffix) {
        return word.endsWith(suffix.replace("-", "")) == true;
    }

    public static int boxSeq(int step){
        if(step == 0){
            return 0;
        }else if(step%2 == 0){
            return step;
        }else return step+2;
    }
}