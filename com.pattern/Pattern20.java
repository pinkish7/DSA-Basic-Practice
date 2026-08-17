public class Pattern20 {
    public void getBasicApproach(){
        int n=5;
        int space=2*n-2;
   for(int i=1; i<=2*n-1;i++){
    int start=i;
    
    System.out.println("");
    if(i>n) start=2*n-i;
      // star
     for(int j=1;j<=start;j++){
     System.out.print("*");
     
     }
     // space 
     for(int j=1;j<=space;j++){
     System.out.print(" ");
     
     }
     
     // start
     for(int j=1;j<=start;j++){
     System.out.print("*");
     
     }
     if(i<n) space-=2;
     else space+=2;
  }
    }
    public void getBestApproach(){
              int n=5;

   for(int i=1; i<=2*n-1;i++){
    int start=Math.min(i,2*n-i);
    int space=2*(n-start);
    System.out.println("");
    
     for(int j=1;j<=2*start+space;j++){
        if(j<=start||j>start+space){
        System.out.print("*");
    }
     else 
     {System.out.print(" ");

     }
    }}}
   public static void main(String[] args) {
      Pattern20 pa=new Pattern20();
      pa.getBasicApproach();
      pa.getBestApproach();
   } 
}
