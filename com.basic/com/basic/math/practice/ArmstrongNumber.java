package com.basic.math.practice;

public class ArmstrongNumber {
    
   public static void main(String[] args) {
    int num=371,sum=0;
    int storeval=num;
    int k = String.valueOf(num).length(); 
    while(num>0){
     int ld=num % 10;
     sum+=Math.pow(ld,k);
     num/=10;
    }
    if(sum==storeval){
        System.out.println("arm");
    }else{
       System.out.println("not"); 
    }
   } 
}
