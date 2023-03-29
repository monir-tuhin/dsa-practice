package searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] arg) {
        int i;
        int arr[] = {2, 5, 8, 9, 19, 41, 45, 57, 98, 123};
        Scanner scanner = new Scanner(System.in);
        int searchItem = scanner.nextInt();

        for (i = 0; i < arr.length; i++ ) {
            if (arr[i] == searchItem) {
                System.out.println(searchItem + " found the item from list.");
                break;
            }
        }

        if (i == arr.length)
            System.out.println(searchItem + " Item not found.");

    }

}
