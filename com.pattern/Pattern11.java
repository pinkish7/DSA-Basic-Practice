public class Pattern11 {

    public static void main(String[] args) {
        int num=5 ,start=1;;
        for(int i=0;i<num;i++){
            System.out.println("");
         if(i%2==0)start=1;
            else start=0;
          for(int j=0;j<=i;j++){  
            
           System.out.print(start);
            start=1-start;
        }
        
        
        }

    }
}  

