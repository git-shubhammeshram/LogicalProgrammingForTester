package LogicalProgramming;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 16461;
        int original = number;
        int r=0;

        while(number>0){
            r = r*10 + number%10;
            number = number/10;
        }

        if(original == r)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
