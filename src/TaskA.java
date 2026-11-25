public class TaskA {
    public static void main(String[] args) {
        int[][] a = {
                {12, 5, 8, 20},
                {3, 17, 9, 14},
                {25, 1, 6, 10}
        };

        int maxSum = Integer.MIN_VALUE;
        int maxRow = 0;

        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += a[i][j];
            }
            System.out.println("Row " + i + " sum: " + sum);

            if (sum > maxSum) {
                maxSum = sum;
                maxRow = i;
            }
        }

        System.out.println("Largest sum is in row " + maxRow + ": " + maxSum);
    }
}
