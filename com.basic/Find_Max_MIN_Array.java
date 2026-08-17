public class Find_Max_MIN_Array {
    public static void main(String []arg ){

        int arr[]={1,4,6,0,7};
        int size=arr.length;
        int min=arr[0],max=arr[0];
        for(int i=1;i<size;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(max<arr[i]){
              max=arr[i];
            }

            
        }
        System.out.println("max : " +max+"min: "+min);
    }
    
}
