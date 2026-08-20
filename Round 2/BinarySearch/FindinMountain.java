public class FindinMountain {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7,5, 3, 2 };
        int target = 5;
        int peak = findpeak(arr);
        int ans = binarysearch(arr, target, 0, peak);
        if(ans == -1) {
            ans = binarysearch(arr, target, peak+1, arr.length-1);
        }
        System.out.println(ans);

    }

    public static int findpeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int binarysearch(int[] arr, int target, int start, int end) {

        boolean asscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (asscending) {

                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
            else{
                 if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }               
            }

        }
        return -1;
    }
}
