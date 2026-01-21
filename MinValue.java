public class MinValue {
    public static void main(String[] args) {

        int [] nums = new int[] {-2,0,5,7,9};

       int min = nums[0];
for(int i = 0; i < nums.length; i++)

if(nums[i] < min){
min = nums[i];

}
    System.out.println(min);

}

    }