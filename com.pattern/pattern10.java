public class pattern10 {
    public static void main(String[] args) {
        int n=5;
       for(int i=0; i<n;i++){
 System.out.println("");
 for(int j=0;j<=i;j++){
    System.out.print("*");
 }
  }

  for(int i=0; i<n;i++){
 System.out.println("");
 for(int j=i;j<n;j++){
    System.out.print("*");
 }
  } 


  /////// batter way to do it
   System.out.println("");
  System.out.println("show batter way");
  for(int i=0; i<=2*n-1;i++){
    int start=i;
    System.out.println("");
    if(i>n) start=2*n-i;
 
     for(int j=0;j<=start;j++){
     System.out.print("*");
     }
  }
    }
}
