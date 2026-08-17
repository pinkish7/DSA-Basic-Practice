package com.basic.math.practice;

public class Palaindrone {
    public static void main(String[] args) {
        int num=4554;
        int dup=num;
        int rev=0;
        while(num>0){
       int lastnum=num %10;
        rev= rev*10+lastnum;
        num=num/10;
        }
        System.out.println(rev);
        if(rev==dup){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
