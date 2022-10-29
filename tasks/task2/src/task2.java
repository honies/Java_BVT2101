public class task2 {
    public static void main(String[] args) {
        System.out.println(repeat("Hello", 3));
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
}