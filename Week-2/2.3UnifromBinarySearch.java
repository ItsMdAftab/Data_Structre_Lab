import java.util.Scanner;

class RecursiveUniformBinarySearch {
    public static int recursiveUniformBinarySearch(int[] array, int key, int[][] lookupTable, int low, int high) {
        if (low > high) {
            return -1; // Key not found
        }

        int mid = lookupTable[low][high];

        if (key == array[mid]) {
            return mid;
        } else if (key < array[mid]) {
            return recursiveUniformBinarySearch(array, key, lookupTable, low, mid - 1);
        } else {
            return recursiveUniformBinarySearch(array, key, lookupTable, mid + 1, high);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of the Array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array length must be greater than 0.");
            sc.close();
            return;
        }

        int[] array = new int[n];
        int[][] lookupTable = new int[n][n];

        System.out.println("Enter the elements of the array in sorted order:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        // Fill the lookup table
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                lookupTable[i][j] = i + (j - i) / 2;
            }
        }

        System.out.print("Enter the Key value: ");
        int key = sc.nextInt();

        int index = recursiveUniformBinarySearch(array, key, lookupTable, 0, n - 1);
        if (index != -1) {
            System.out.println("Key found at index: " + index);
        } else {
            System.out.println("Key not found.");
        }

        sc.close();
    }
}
