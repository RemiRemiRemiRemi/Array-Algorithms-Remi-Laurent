public class locateMin {




    public static int locateMinimum(int[] arr){

        int min = arr[0];
        
        for(int i = 0; i < arr.length; i++){
        
        if(min > arr[i]){
        min = i;
        
        }
        
        }
        
        return min;
        }

        
    public static void main(String[] args) {
        
        int[] arr = {0, 1, 2, 2, 1, 3};

        System.out.println(locateMinimum(arr));

    }
}
