package searching;

public class BinarySearch {
    public static void main(String[] arg) {
        int arraySize = 10;
        int arr[] = {2, 5, 8, 9, 19, 41, 45, 57, 98, 123};
        int i, startPoint, endPoint, midPoint, item, location, comparison;
        item = 57; // the value we want to search

        // start binary search
        startPoint = 0;
        endPoint = arr.length - 1;
        location = -1;
        comparison = 0;

        while (startPoint <= endPoint) {
            comparison++;
            midPoint = (startPoint+endPoint)/2;

            if (arr[midPoint] == item) {
                location = midPoint;
                break;
            } else if (arr[midPoint] < item) {
                startPoint = midPoint+1;
            } else {
                endPoint = midPoint-1;
            }
        }

        for (int a : arr) {
            System.out.println("counting.... " + a);
        }

        if (location == -1) {
            System.out.println("No item found in this list ," + item + ", " + comparison);
        } else {
            System.out.println("Item found ! ," + item + ", " + location+1 + ", " + comparison);
        }

    }
}
