package com.basic.math.practice;

public class PrimeNumber {
    boolean getPrimeNumberBasicApproach(){
        int num=4;
        int result=0;

       for(int i=1;i<=num;i++){
        if(num %i ==0){
        result++;
        }

        }
    return result==2 ;
 }
 boolean getPrimeNumberoptimizeApproach(){
        int num=3;
        int result=0;

       for(int i=1;i<=Math.sqrt(num);i++){
        if(num %i ==0){
        result++;
        if(num/i!=1){
            result++;
        }
        }

        }
    return result==2 ;
 }
   public static void main(String[] args) {
    PrimeNumber pn=new PrimeNumber();
   boolean result= pn.getPrimeNumberBasicApproach();
    if(result){
        System.out.println("prime");
    }else{
       System.out.println("not"); 
    }
    boolean opt= pn.getPrimeNumberoptimizeApproach();
    if(opt){
        System.out.println("prime");
    }else{
       System.out.println("not"); 
    }
   } 
   } 


