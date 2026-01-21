//Remi-Laurent Guy | 1/21/26
//Repository for all twelve algorithms
public class Example1 {

    public static void main(String[] args) {
int [] nums = new int[] {-2,0,5,7,9};

//FOR LOOP
System.out.println("For loop:");

for(int i = 0; i < nums.length; i++){
    System.out.println(nums[i]);
}

//WHILE LOOP
System.out.println("While loop:");
int count = 0;

while(count < nums.length){
    System.out.println(nums[count]);
    count++;
}

//ADVANCED LOOP
for(int num : nums)

    System.out.println(num);

}

    }
