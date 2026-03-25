package day1;
// https://leetcode.com/problems/move-zeroes/
public class MoveAlltheZerosToEnd {
    public static void main(String[] args) {
        
    }
    public static void moveZeros(int []arr){
        int i=0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[j]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i++;
            }
        }
    }
}
