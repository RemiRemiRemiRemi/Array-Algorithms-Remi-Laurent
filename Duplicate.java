public class Duplicate {
  public static void main(String[] args) {
      
    String [] classes = new String[] {"Engineering", "Algebra", "History", "English", "Lunch", "Computer Science", "Chemistry", "Chemistry", "French"};
    System.out.println(containsDuplicate(classes));

  }


    public static boolean containsDuplicate(String [] arr){
    int count = 0;
    
    while(count < arr.length - 1){
    int count2 = 0;

        while(count2 < arr.length - 1){
            if(arr[count2].equals(arr[count]) && count != count2){
                return true;
            }
            count2++;
        }

        count++;
    }

    return false;

    }

}
  

