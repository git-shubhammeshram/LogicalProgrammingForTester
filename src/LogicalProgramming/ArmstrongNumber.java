package LogicalProgramming;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 121;
        int original = number;
        int r, sum = 0;

        while(number>0){
            r = number%10;
            number = number/10;
            sum = sum+r*r*r;
        }
        if(original == sum)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
