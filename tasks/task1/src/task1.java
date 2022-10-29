public class task1 {
    public static void main(String[] args) {
        System.out.println(remainder(4, 3));
        System.out.println(triArea(10, 2));
        System.out.println(animals(3, 6, 7));
        System.out.println(profitableGamble(0.8, 2, 3));
        System.out.println(operation(32, 8, 4));
        System.out.println(ctoa('@'));
        System.out.println(addUpTo(12));
        System.out.println(nextEdge(9, 15));
        System.out.println(sumOfCubes(new Integer[]{4, 5, 6}));
        System.out.println(abcMath(3, 4, 5));
    }
    public static int remainder(int x, int y){
        return x % y;
    }

    public static double triArea(int a, int h){
        return 0.5 * a * h;
    }

    public static int animals(int chicken, int cows, int pigs){
        int chickenLegs = 2;
        int cowLegs = 4;
        int pigLegs = 4;
            return chicken * chickenLegs + cows * cowLegs + pigs * pigLegs;
    }

    public static boolean profitableGamble(double prob, int prize, int pay){
        if (prob*prize>pay){
            return true;
        } else return false;
    }

    public static String operation(int n, int a, int b){
        if (a + b == n){
            return "added";
        } else if (a - b == n) {
            return "subtracted";
        } else if (a * b == n) {
            return "multiplied";
        } else if (a / b == n) {
            return "divided";
        } else return "none";
    }

    public static int ctoa(char asii){
        return ((int) asii);
    }

    public static int addUpTo(int a){
        int sum = 0;
        for (int i = 1; i < a+1; i++){
            sum+= i;
        }
        return sum;
    }

    public static int nextEdge(int x, int y){
        return x + y - 1;
    }

    public static int sumOfCubes(Integer[] x){
        int sum = 0;
        for (int i = 0; i < x.length; i++){
            sum += Math.pow(x[i], 3);
        }
        return sum;
    }

    public static boolean abcMath(int a, int b, int c) {
        for (int i = 0; i < b; i++) {
            a += a;
        }
        if (a % c == 0) {
            return true;
        } else return false;
    }
}