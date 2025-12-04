
/**
 * Write a description of class Delara_6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Delara_6
{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int[] arr = {3, 4, 7, 10, 9};
int sum = 0, count = 0;

for (int n : arr) {
    if (n % 2 != 0) {
        sum += n;
        count++;
    }
}

double avg = (double) sum / count;
System.out.println("Average of odd numbers: " + avg);
}
}