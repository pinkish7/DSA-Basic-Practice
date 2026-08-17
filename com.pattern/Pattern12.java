public class Pattern12 {
    public static void main(String[] args) {
        int num=5;
for(int i=1;i<num;i++){
            System.out.println("");
            for(int j=1;j<=i;j++){
                System.out.print(j);
                
            }
            for(int j=1;j<2*num-(2*i+1);j++){
             System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print(j);

                
            }
        }
  }  
    }

