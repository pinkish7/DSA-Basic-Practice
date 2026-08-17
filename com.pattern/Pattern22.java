public class Pattern22 {
    public void getGoodApproach(){
    int n=7;
    for(int i=0;i<n;i++){
        System.out.println();
        for(int j=0;j<n;j++){
        int layer=Math.min(Math.min(i, n-1-i),Math.min(j, n-1-j));
        int val=(n/2+1)-layer;
         System.out.print(val);   
        }}}
    
   public static void main(String[] args) {
    Pattern22 pa=new Pattern22();
    pa.getGoodApproach();
   } 
}
