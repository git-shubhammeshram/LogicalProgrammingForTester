package LogicalProgramming;

public class PalindromeString {
    public static void main(String[] args) {
        String name = "madam";
        String revName = "";

        for(int i=name.length()-1; i>=0; i--){
           revName = revName+name.charAt(i);
        }

        if(name.equals(revName))
            System.out.println(1);
        else
            System.out.println(0);


    }
}
