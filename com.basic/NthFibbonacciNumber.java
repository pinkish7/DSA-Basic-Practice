public class NthFibbonacciNumber {
    //Naive Approach] Using Recursion

    public static int getFibonacciNum(int num){
        if(num<=1) return num;
        return getFibonacciNum(num-1)+getFibonacciNum(num-2);
    }

    // Bottom Up Space Optimized Approach - O(n) Time and O(1) Space

    public static int getFibonacciNumOptimizeApproach(int num){
        if(num<=1) return num;
        int curr=0,prev1=1,prev2=0;
        for(int i=2;i<=num;i++){
         curr=prev1+prev2;
         prev2=prev1;
         prev1=curr;
        }
        return curr;
    }
    public static void main(String[] args) {
        int num=5;
        int result=getFibonacciNum(num);
        System.out.println(result);
        int result1=getFibonacciNumOptimizeApproach(num);
        System.out.println(result1);
    }
}
