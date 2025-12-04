
/**
 * Write a description of class Delara_5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Delara_5
{
 public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int[] arr = {3, 5, 7, 1, 4};
int target = 7;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] == target) {
        System.out.println("Found at index " + i);
        break;
    }
}
}
}