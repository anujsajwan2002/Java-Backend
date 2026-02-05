package TwoPointers;

public class IsHappy {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n){   //slow and fast pointer approach
        int slow = n;
        int fast = n;

        do{
            slow = square(slow);
            fast = square(square(fast));
        }while(slow != fast);

        return slow == 1;
    }
    public static int square(int n){
        int ans = 0;
        while(n > 0){   //123
            int remainder = n%10;
            ans = ans + remainder * remainder;
            n = n/10; //removes last digit
        }
        return ans;
    }
}
