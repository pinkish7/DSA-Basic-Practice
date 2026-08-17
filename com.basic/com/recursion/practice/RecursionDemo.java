package com.recursion.practice;

public class RecursionDemo {
    void  getPrintNameNTime(String name, int count, int num){
      if(count==num) return;
      System.out.println(name); 
      getPrintNameNTime(name,count+1,num);
    }
    void  getPrintNumNTime(int count, int num){
      if(count>num) return;

     System.out.println(count); 
      getPrintNumNTime(count+1,num);
    }
    void  getPrintNToOneTime(int curr, int num){
      if(curr<1) return;
     System.out.println(curr); 
      getPrintNToOneTime(curr-1,num); 
    }
    void getSumofFirstNNaturalNumbers(int sum,int num){
     for(int i=1;i<=num;i++)
        sum+=i;
        System.out.println(sum);
       

    } 

    public static void main(String[] args) {
       RecursionDemo rc=new RecursionDemo();
       String name="pinkii";
       int count=1,num=10,sum=0;
       rc.getPrintNameNTime(name,0, num);
       rc.getPrintNumNTime(count, num);
        rc.getPrintNToOneTime(num, num);
        rc.getSumofFirstNNaturalNumbers(sum, num);
    }
}
