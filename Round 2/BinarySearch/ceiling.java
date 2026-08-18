public class ceiling {
    public static void main(String[] args) {
        int[] arr = {2 ,3 ,4 ,9, 14, 16, 17, 18};
        int target = 15;
       int ans = search(arr , target);
        System.out.println(ans);

    }
    // smallest number in the array greater than target
    static int search (int [] arr , int target) {
        int start = 0;

        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;

            } else if (target < arr[mid]) {
                end = mid - 1;

            }else {
                return mid;
            }
        } return start;
    }
}
