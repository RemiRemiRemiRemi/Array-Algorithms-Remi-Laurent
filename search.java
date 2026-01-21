public class search {
public static void main(String[] args) {
    String [] names = new String[] {"Jack", "Uri", "Kiana", "Kellin", "Remi"};

    for(String name : names){
        if(name.substring(0,1).equals("K")){
            System.out.println(name);
        }
    }


    }

}    