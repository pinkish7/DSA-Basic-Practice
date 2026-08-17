package com.basic.math.practice;

import java.util.ArrayList;
import java.util.List;

public class DivisorsNumbers {
   void getBasicApproach(){
       int num=36;
    List<Integer> res = new ArrayList<>();

   for(int i=1;i<=num;i++){
    if(num % i==0){
    res.add(i);

    }
    for (Integer in : res) {
       System.out.println(in) ;
    }
   }
   } 
   void getBestApproach(){
         int num=36;
 for(int i=1;i*i<=num;i++){
    if(num % i==0){
    System.out.println(i) ;
     if(i!=num/i){
       System.out.println(num/i) ; 
     }

    }

   }
   } 
    
   public static void main(String[] args) {
    DivisorsNumbers dc=new DivisorsNumbers();
    dc.getBasicApproach();
    dc.getBestApproach();
}
}