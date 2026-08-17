package com.basic.math.practice;

public class GCDOFTWONumber {
    void getGCDBasicApproach(){
        int n1=9,n2=12,gcd=0;
        for(int i=1;i<=Math.min(n1, n2);i++){
            if(n1 % i == 0 && n2 % i == 0){
             gcd=i;
            }
        }
        System.out.println(gcd);
    }
    int getGCDBetterApproach(){
        int n1=9,n2=12;
        for(int i=Math.min(n1, n2);i>0;i--){
            if(n1 % i == 0 && n2 % i == 0){
        return i;
            }

        }
        return 1;
    }
    public static int getGCDBestApproach() {
                int a=9,b=12;
        while(a > 0 && b > 0) {

            if(a > b) {

                a = a % b;
            }

            else {
               
                b = b % a;
            }
        }

        if(a == 0) {
            return b;
        }

        return a;
    }

   public static void main(String[] args) {
    GCDOFTWONumber gc=new GCDOFTWONumber();
    gc.getGCDBasicApproach();
   System.out.println( gc.getGCDBetterApproach());
   System.out.println( gc.getGCDBestApproach());
   } 
}
