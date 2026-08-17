import java.util.Arrays;

public class Anagram {
    public static void main(String []asd){
       String str1="listen";
        String str2="silent";
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if(str1.length()!=str2.length()){
           System.out.println("not ana"); 
        }
        char [] starr1=str1.toCharArray();
       char [] strarr2=str2.toCharArray();
        Arrays.sort(starr1);
        Arrays.sort(strarr2);
     if(Arrays.equals(starr1,strarr2)){
        System.out.println("ana");

     }else{
        System.out.println("not");
     }
   
    }
}
    