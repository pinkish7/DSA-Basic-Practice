public class Factorial {
    public static int getFactorialNumber(int num){
        if(num==0 || num==1)
            return 1;
        return num* getFactorialNumber(num-1);
    }
   public static void main(String[] args) {
    int num=5;
    int factorialNumber=getFactorialNumber(num);
    System.out.println(factorialNumber);
   } 
}
