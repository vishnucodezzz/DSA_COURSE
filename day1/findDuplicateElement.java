package day1;

import java.util.HashSet;
import java.util.Set;

public class findDuplicateElement {
    public static void main(String[] args) {
        
    }
    public static boolean duplicateNumber(int []arr){
        Set<Integer>seen= new HashSet<>();
        for (int num : arr) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
