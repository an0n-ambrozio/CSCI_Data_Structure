public class fibonacci {

    public static int fibonacci(int i, int[] arr) {
        if (i < 2) {
            return arr[i] = i;
        }
        return arr[i] = fibonacci(i - 1, arr) + fibonacci(i - 2, arr);
    }

    public static void main(String[] args) {
        int n = 10; 

        int[] arr = new int[n];

        
        for (int i = 0; i < n; i++) {
            fibonacci(i, arr);
        }

        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}