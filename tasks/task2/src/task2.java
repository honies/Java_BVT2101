import java.math.BigDecimal;
import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {
        System.out.println(repeat("Hello", 3));
        System.out.println(differenceMaxMin(new int[]{1,3,54,6,7,13}));
        System.out.println(isAvgWhole(new int[]{2,4,5,6,7,8,8}));
        System.out.println(cumulativeSum(new int[]{1,2,4,5}));
        System.out.println((int)getDecimalPlaces("43.222"));
        System.out.println(fibonacci(10));
        System.out.println(isValid("134 43342"));
        System.out.println(isStrangePair("mother", "rum"));
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(boxSeq(1));
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
        if(listSum % n == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static String cumulativeSum(int[] list){
        for(int n = 1; n == list[list.length - 1]; n++){
            list[n] = list[n-1] + list[n];
        }
        return Arrays.toString(list);
    }

    public static double getDecimalPlaces(String string){
        double value = Double.parseDouble(string);
        return (int)BigDecimal.valueOf(value).scale();
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
        if (string.length() > 5)
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
        if(firstString.charAt(0) == secondString.charAt(secondString.length()-1) && firstString.charAt(firstString.length()-1) == secondString.charAt(0)){
            return true;}
        return false;
    }

    public static boolean isPrefix(String word, String prefix){
        if(word.startsWith(prefix.replace("-", "")) == true){
            return true;
        }else return false;
    }

    public static boolean isSuffix(String word, String suffix) {
        if(word.endsWith(suffix.replace("-", "")) == true) {
            return true;
        }else return false;
    }

    public static int boxSeq(int step){
        if(step == 0){
            return 0;
        }else if(step%2 == 0){
            return step;
        }else return step+2;
    }

}