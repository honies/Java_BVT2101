import java.security.PublicKey;
import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        System.out.println("------№1------");
        System.out.println(solutions(1, 0, -1));
        System.out.println(solutions(1, 0, 0));
        System.out.println(solutions(1, 0, 1));


        System.out.println("------№2------");
        System.out.println(findZip("all zip files are zipped"));
        System.out.println(findZip("all zip files are compressed"));


        System.out.println("------№3------");
        System.out.println(checkPerfect(6));
        System.out.println(checkPerfect(496));
        System.out.println(checkPerfect(97));


        System.out.println("------№4------");
        System.out.println(flipEndChars("Cat, dog, and mouse."));
        System.out.println(flipEndChars("ada"));
        System.out.println(flipEndChars("z"));


        System.out.println("------№5------");
        System.out.println(isValidHexCode("#CD5C5C"));
        System.out.println(isValidHexCode("#CD5C58C"));
        System.out.println(isValidHexCode("CD5C5C"));
        System.out.println(isValidHexCode("#CD5C&C"));


        System.out.println("------№6------");
        System.out.println(same(new int[]{1, 3, 4, 4, 4}, new int[]{2, 5, 7}));
        System.out.println(same(new int[]{9, 8, 7, 6}, new int[]{4, 4, 3, 1}));
        System.out.println(same(new int[]{2}, new int[]{3, 3, 3, 3, 3}));


        System.out.println("------№7------");
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("------№8------");
        System.out.println(longestZero("01100001011000"));
        System.out.println(longestZero("100100100"));
        System.out.println(longestZero("11111"));


        System.out.println("------№9------");
        System.out.println(nextPrime(12));
        System.out.println(nextPrime(24));
        System.out.println(nextPrime(11));


        System.out.println("------№10------");
        System.out.println(rightTriangle(3, 4, 5));
        System.out.println(rightTriangle(145, 105, 100));
        System.out.println(rightTriangle(70, 130, 110));
        System.out.println(same(new int[]{}, new int[]{}));
    }

    public static int solutions(int a, int  b, int c){
        if(b * b - 4 * a * c > 0){
            return 2;
        } else if(b * b - 4 * a * c == 0) {
            return 1;
        }else return 0;
    }

    public static int findZip(String string) {
        int count = 0;
        for(int i = 0; i < string.length(); i++) {
            if(count == 0 && string.charAt(i) == 'z' && string.charAt(i + 1) == 'i' && string.charAt(i + 2) == 'p'){
                count += 1;
            }else if(count == 1 && string.charAt(i) == 'z' && string.charAt(i + 1) == 'i' && string.charAt(i + 2) == 'p'){
                return i;
            }
        }
        return -1;
    }

    public static boolean checkPerfect(int n){
        int divSum = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                divSum += i;
            }
        }
        return n == divSum;
    }

    /*Логика метода isValidHexCode
    * На вход подается hex строка и с помощью метода matches сообщает, соответствует ли строка регулярному выражению*/
    public static boolean isValidHexCode(String hexString){
        return hexString.matches("^#[A-Za-z0-9]{6}");
    }

    public static String flipEndChars(String string){
        if(string.length() < 2){
            return "Incompatible.";
        }else{
            char[] flipString = string.toCharArray();
            if(flipString[0] == flipString[flipString.length - 1]){
                return "Two's a pair.";
            }else{
                char firstChar = flipString[0];
                flipString[0] = flipString[flipString.length - 1];
                flipString[flipString.length - 1] = firstChar;
                String newString = new String(flipString);
                return newString;
            }
        }

    }

    public static boolean same(int[] firstList, int[] secondList) {
        int uniqueNum1 = 1;
        int uniqueNum2 = 1;
        for (int i = 0; i < firstList.length - 1; i++) {
            if (firstList[i] != firstList[i + 1]) {
                uniqueNum1++;
            }
        }
        for (int i = 0; i < secondList.length - 1; i++) {
            if (secondList[i] != secondList[i + 1]) {
                uniqueNum2++;
            }
        }
        return uniqueNum2 == uniqueNum1;
    }

    /*public static boolean isKaprekar(int num){
        if(num == 0 || num == 1){
            return true;
        }

    }*/

    public static String longestZero(String string){
        char[] list = string.toCharArray();
        String string1 ="";
        String string2 = "";
        for(int i = 0; i < list.length; i++){
            if(list[i] == "0".charAt(0)){
                string1 += "0";
                if(string2.length() < string1.length()){
                    string2 = string1;
                }
            }else string1 ="";
        }
        return string2;
    }

    public static int nextPrime(int num){
        if(num == 1){
            return num;
        }
        for(int i = 2; i < num; i++) {
            if (num % i == 0) {
                num++;
            }
        }
        return num;
    }

    public static boolean rightTriangle(int a, int b, int c){
        int[] list = {a, b, c};
        Arrays.sort(list);
        return list[0]*list[0] + list[1]*list[1] == list[2]*list[2];
    }
}