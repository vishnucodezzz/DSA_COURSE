package day1;
import java.util.*;

public class FirstAndLast {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int [] arr= new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int x=sc.nextInt();

        firstAndLastOccurence(arr,x);
    }
    public static void firstAndLastOccurence(int []arr,int x){
        int first=-1;
        int last=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                if(first==-1){
                    first=i;
                }
                last=i;
            }
        }
        System.out.println(first+" "+last);
    }
    
}