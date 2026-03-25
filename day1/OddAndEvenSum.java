package day1;

public class OddAndEvenSum {
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        int evenSum=0;
        int oddSum=0;

        for (int i : arr) {
            if(isOdd(i))
                oddSum+=i;
            else
                evenSum+=i;
        }
        System.out.println(evenSum+" "+oddSum);
    }
    private static boolean isOdd(int n) {
       return ( n & 1 )== 1;
    }
}
