public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(dynamicFibonacci(4000000));
    }

    public static int dynamicFibonacci(int n) {
        // 동적프로그래밍
        int last1, last2, last3, result;

        if (n <= 1)
            return 1;

        last1 = 1;
        last2 = 2;
        result = 0;

        while (true) {
            last3 = last1 + last2;

            if (last3 > 4000000)
                break;

            if (last3 % 2 == 0)
                result += last3;
            
            last1 = last2;
            last2 = last3;
        }



        return result;
    }

}
