public class Pattern17 {
    public static void main(String[] args) {
        String str="ABC";
            char ch[]=str.toCharArray();
    for(int i=0;i<ch.length;i++){

              System.out.println("");

            for(int j=0;j<ch.length-1;j++){
                System.out.print(" ");
            }
            
            for(int j=0 ;j<=2*i;j++){
                int index;
                if(j<=i){
                    index=j;
                }else{
                    index=2*i-j;
                }
            System.out.print(ch[index]);
        
             } 
             
             /*for(int j=0;j<ch.length-1;j++){
                System.out.print("*");
                
            }*/
        }
    }
    }

