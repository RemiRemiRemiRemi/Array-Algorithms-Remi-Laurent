public class AverageNew {


    public static double findAverage(int[] arr){

        double average = 0;
        
        for(int i = 0; i < arr.length; i++){
        
        average += arr[i];
        
        }
        
        average /= arr.length;
        return average;
        }
        


    public static void main(String[] args) {
                int[] arr = {0, 1, 2, 2, 1, 3};

                System.out.println(findAverage(arr));

    }
}
