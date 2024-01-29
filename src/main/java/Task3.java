public class Task3 {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 6, 9, 12, 14};

        for (int num : array) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }
    }
}