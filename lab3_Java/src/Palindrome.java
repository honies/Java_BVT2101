public class Palindrome {
    public static void main(String[] args){

        for (int i= 0; i < args.length; i++){
            String s = args[i];
            System.out.print(isPalindrome(s) + " ");
        }
    }
    /*
    Логика reverseString на вход подается строка primal_string, затем создается пустая строка reverse_string.
    For пеербирает эту строку по индексам с конца и заносит в прееменную reverse_string, после чего возвращается
    перевернутая строка
     */
    public static String reverseString(String primal_string){
        String reverse_string = "";
        for (int i = primal_string.length()-1;i > -1; i--){

            reverse_string += primal_string.charAt(i);
        }
        return reverse_string;
    }
    /*
    Логика метода isPalindrome на вход подается строка s, после чего создается переменная primal_string, которая
    равняется s, затем создается переменная reverse_string, которая равняется тому, что вернул метод reverseString
    Строки сравниваются, и в зависимости от того, равняются стоки или нет, нам возвращается rue or false
     */
    public static boolean isPalindrome(String s){
        String primal_string = s;
        String reverse_string = reverseString(primal_string);
        return primal_string.equals(reverse_string);
    }
}