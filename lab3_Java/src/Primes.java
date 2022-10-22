public class Primes {
    public static void main (String[] args){
        for(int i = 2; i < 101; i++){ //цикл перебора чисел от 2 до 100
            if(isPrime(i)){  //при ложном значении isPrime,  число не будет выводится
                System.out.print(i + " "); //вывод числа с пробелом
            }
        }
    }
    /*
    Метод isPrime получает число после чего идет проверка по циклу на делимость с остатком.
    Если число на входе делится хотя бы на одно от 2 до этого числа не включая его (i < n) без остатка,
    то цикл прекращается, а переменной k задается ложное значение (в начале цикла значение  true)/
    Воазвращается значение переменной k
     */
    public static boolean isPrime(int n) {
        boolean k = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                k = false;
                break;
            }
        }
        return k;
    }
}
