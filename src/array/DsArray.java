package array;

import java.util.Arrays;
import java.util.Scanner;

public class DsArray {
    public static void main(String[] arg) {
//       array creation
        int noOfStudents = 5, j;
        int age[] = new int[noOfStudents];
        int sum = 0;

        for (int i=0; i <age.length; i++) {
            Scanner sc = new Scanner(System.in);
            age[i] = sc.nextInt();
            sum += age[i];
        }

        for (int a: age) {
            System.out.println(a);
        }

//        System.out.println("Average age of students : " + sum/noOfStudents);

        // array update
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
//        int value = sc.nextInt();
//        age[index] = value;

        j = index;
        while (j < noOfStudents-1) {
            age[j] = age[j+1];
            j++;
        }

        age = Arrays.copyOf(age, age.length - 1);

        for (int a: age) {
            System.out.println(a);
        }
        System.out.println(age.length);

    }
}
