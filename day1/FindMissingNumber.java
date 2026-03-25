package day1;
// https://leetcode.com/problems/missing-number/?envType=problem-list-v2&envId=array
public class FindMissingNumber {

    public static void main(String[] args) {
        int []arr={0,1,2,3,5};
        int misNumber=missingNumber(arr);
        System.out.println(misNumber);
    }
    public static int missingNumber(int[] nums) {
        
        int n = nums.length;
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        int total = n * (n + 1) / 2;
        return total - sum;
    }
}
