public class Pattern15 {
   public static void main(String[] args) {
        String str="ABCDE";
    char ch[]=str.toCharArray();
    int size=ch.length;
    for(int i=ch.length;i>=1;i--){
        System.out.println("");
        for(int j=0;j<i;j++){
            System.out.print(ch[j]);
        }
    }
   } 
   


}
