public class Pattern18 {
   public static void main(String[] args) {
            String str="ABCDE";
            char ch[]=str.toCharArray();
    for(int i=0;i<ch.length;i++){

              System.out.println("");

           /*  for(int j=0;j<ch.length-1;j++){
                System.out.print(" ");
            }*/
            
            for(int j=ch.length-i-1; j<ch.length;j++){
               
            System.out.print(ch[j]);
        
             } 
            /* for(int j=0;j<ch.length-1;j++){
                System.out.print(" ");
            }*/
   } 

   }}