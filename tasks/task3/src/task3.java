import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        System.out.println("------№1------");
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("------№2------");
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("------№3------");
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println("------№4------");
        System.out.println();
        System.out.println();
        System.out.println();


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