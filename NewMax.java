public class NewMax {

    public static double findMax(int[] arr){

        double max = arr[0];
        
        for(int i = 0; i < arr.length; i++){
        
        if(max < arr[i]){
        max = arr[i];
        }
        
        }
        
        return max;
        }
        

    
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 1, 3};

        System.out.println(findMax(arr));
    }
}
