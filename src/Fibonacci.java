import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public int fibonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    
    private Map<Integer, Integer> memo = new HashMap<>() ;
    
    public int fibonacciTD(int n, int[] memo) {
            //fibonacci con Top-Down (Memoization)
            if (n <= 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            }
            
            if (memo[n] != 0) {
                return memo[n];
            }
            
            memo[n] = fibonacciTD(n - 1, memo) + fibonacciTD(n - 2, memo);
            return memo[n];
        }
    public long fibonacciBU(int n){
        //fibonacci con Bottom-Up (Tabulation)
        if (n<=1) {
            return n;
        }
        long [] dp = new long[n+1];
        dp[0]=0;
        dp[1]=1;
        for (int i = 2; i <= n; i++) {
            dp[i]= dp[i-1]+ dp[i-2];
        }

        return dp[n];
    }

    public int fibOptimizado(int n){
        if (n<=1) {
            return n;
        }
        int a=0;
        int b=1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }


        return b;
    }

}