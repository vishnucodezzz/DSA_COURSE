package day1;

import java.util.Scanner;

public class MaxElementInArray {
    
    public static void main(String[] args) {
        // int arr[]={78,58,9,433,43,56,734,56};

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int []arr= new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
         
        int maxElement=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>maxElement){
                maxElement=arr[i];
            }
        }
        System.out.println(maxElement);
    }
}
