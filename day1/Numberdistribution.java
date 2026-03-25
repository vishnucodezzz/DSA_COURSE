package day1;

public class Numberdistribution {
    public static void main(String[] args) {

        int arr[]= {0,43,54,-23,-43,0,34};

        int posNums=0;
        int negNums=0;
        int zeros=0;
        
        for (int i : arr) {
            if(i==0){
                zeros+=1;
            }
            else if(i<0){
                negNums+=1;
            }else{
                posNums+=1;
            }
        }
        System.out.println(posNums+" "+negNums+" "+zeros);
    }
}
