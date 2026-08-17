package com.basic.math.practice;
public class CountTotalDigits {
    void getTotalDigits(){
     int num=102345;
     int count=0;
     if(num==0){
        count=1;
     }else{
     while(num>0){
        count++;
        num/=10;
     }}
System.out.println(count);
    }
    void getTotalDigitsStartWithZero(){
        int num=012345;
       String str=String.format("%06d", num);
           System.out.println(str.length());
    }
    
    public static void main(String[] args) {
       CountTotalDigits ct=new CountTotalDigits();
       ct.getTotalDigits();
       ct.getTotalDigitsStartWithZero();
}}
