public class ReverseString {
   public static void main(String[] args) {
    String sentance="ReetaGeeta";
    char arr[]=sentance.toCharArray();
    for (int i=arr.length-1;i<arr.length;i--) {
        System.out.println(arr[i]);
    }
   } 
}
