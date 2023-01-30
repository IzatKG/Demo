package gulnara;

public class GumaDemo {
    public static void main(String[] args) {
        System.out.println("Hello! I am QA tester!");
        int[] arr = {4, 6, 8, 7, 12};
        System.out.println(arr.toString());
    }
    public static int makeSum(int[] arr) {
        int sum = 0;
        for (Integer j : arr) {
            sum = sum + j;
        }
        return sum;

    }

}
