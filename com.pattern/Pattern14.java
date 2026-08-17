public class Pattern14 {
   public static void main(String[] args) {
    String str="ABCDE";
    char ch[]=str.toCharArray();
    for(Character c:ch){
        System.out.println("");
        for(Character d=ch[0];d<=c;d++){
            System.out.print(d);
        }
    }
   } 
}
