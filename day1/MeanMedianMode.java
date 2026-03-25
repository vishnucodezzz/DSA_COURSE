package day1;

public class MeanMedianMode {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 6 };
        int n = 7;
        float mean;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        mean = (float) sum / n;

        float median = n % 2 == 0 ? (arr[(n / 2) - 1] + arr[(n / 2)]) / 2.0f : arr[n / 2];

        int mode = arr[0];
        int maxCount = 1;
        int count = 1;
        int i = 0;
        int j = 1;
        while (j < n) {
            if (arr[i] == arr[j]) {
                count++;
            } else {
                if (count > maxCount) {
                    mode = arr[i];
                    maxCount = count;
                }
                i = j;
                count=1;
            }
            j++;
        }
        if (count > maxCount) {
            mode = arr[i];
        }
        // System.out.println(String.format("%.2f , %.2f", mean,median));
        System.out.printf("%.2f , %.2f, %d", mean, median, mode);

    }
}
