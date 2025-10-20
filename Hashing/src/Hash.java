import java.io.*;
import java.util.HashSet;
import java.util.Scanner;

public class Hash {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter number of elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element "+(i+1)+" : ");
            int temp = sc.nextInt();
            set.add(temp);
        }
        sc.close();

        System.out.println("The size of the set is "+ set.size());
        System.out.println(set);
    }
}