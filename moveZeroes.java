public class moveZeroes {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 4, 5, 6, 0, 7, 2};
        int j = 0; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (i != j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
