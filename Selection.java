//Remi-Laurent Guy | 1/22/26

public class Selection {

    public static void main(String[] args) {

        String [] classes = new String[] {"Engineering", "Algebra", "History", "English", "Lunch", "Computer Science", "Chemistry", "Chemistry", "French"};

        for(int i = 0; i < classes.length - 1; i++){ //"-1" is necessary because there is nothing after French, so French should not be paired. This prevents an error.

            System.out.println(classes[i] + " " + classes[i + 1]);

        }

    }
}