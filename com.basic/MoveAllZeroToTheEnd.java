import java.util.Arrays;

public class MoveAllZeroToTheEnd {
    public static void getAllZeroAtTheEnd(int array[]){

if (array == null) return;
        
        int writeIndex = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                // Swap the non-zero element with the element at writeIndex
                int temp = array[writeIndex];
                array[writeIndex] = array[i];
                array[i] = temp;
                
                writeIndex++;
            }
        }
    }

        
    
    public static void main(String[] args) {
        int array[]={0,3,0,4,0,5,6,0};
        
        getAllZeroAtTheEnd(array);
        System.out.println(Arrays.toString(array));
    }
}
