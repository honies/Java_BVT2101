import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        System.out.println("------№1------");
        System.out.println(solutions(1, 0, -1));
        System.out.println(solutions(1, 0, 0));
        System.out.println(solutions(1, 0, 1));


        System.out.println("------№2------");
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("------№3------");
        System.out.println(checkPerfect(6));
        System.out.println(checkPerfect(496));
        System.out.println(checkPerfect(97));


        System.out.println("------№4------");
        System.out.println(flipEndChars("Cat, dog, and mouse."));
        System.out.println(flipEndChars("ada"));
        System.out.println(flipEndChars("z"));


        System.out.println("------№5------");
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("------№6------");
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("------№7------");
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("------№8------");
        System.out.println(longestZero("01100001011000"));
        System.out.println(longestZero("100100100"));
        System.out.println(longestZero("11111"));


        System.out.println("------№9------");
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("------№10------");
        System.out.println(rightTriangle(3, 4, 5));
        System.out.println(rightTriangle(145, 105, 100));
        System.out.println(rightTriangle(70, 130, 110));
    }

    public static int solutions(int a, int  b, int c){
        if(b * b - 4 * a * c > 0){
            return 2;
        } else if(b * b - 4 * a * c == 0) {
            return 1;
        }else return 0;
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

    public static boolean rightTriangle(int a, int b, int c){
        int[] list = {a, b, c};
        Arrays.sort(list);
        return list[0]*list[0] + list[1]*list[1] == list[2]*list[2];
    }
}