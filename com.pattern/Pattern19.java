public class Pattern19 {

    public void getBestApproach(){
        int n=5;
        for(int i=0;i<2*n;i++){
            int k=Math.min(i,2*n-1-i);
            System.out.println(
                "x" .repeat(n-k)+
                " ".repeat(2*k)+
                "x".repeat(n-k)
            );

        }
    }
    public void getBacisApproach(){
        for(int i=0;i<=5;i++){
            System.out.println(""); 
            for(int j=i;j<=5;j++){
                System.out.print("x");
            }
            for(int j=0;j<i;j++){
                System.out.print("  ");
                
            }

            for(int j=i;j<=5;j++){
                System.out.print("x");
            }

        }
        for(int i=0;i<=5;i++){
            System.out.println("");
            for(int j=0;j<=i;j++){
                System.out.print("x");
            }
            for(int j=0;j<=10-(2*i+1);j++){
                System.out.print(" ");
            }

            for(int j=0;j<=i;j++){
                System.out.print("x");
            }
        }
    }

   public static void main(String[] args) {
    

        Pattern19 pa=new Pattern19();
        pa.getBestApproach();
        pa.getBacisApproach();
   } 
}
