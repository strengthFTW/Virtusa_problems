public class decensingSearch {
    public static void main(String[] args) {
        int[] arr = {98 ,83 , 76 ,68 , 52 ,40 ,31 ,22 ,16 };
        int target = 83;
        int ans = search(arr , target);
        System.out.println(ans);
    }
    static int search (int [] arr , int target) {
        int start = 0;

        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                start = mid + 1;

            } else if (target > arr[mid]) {
                end = mid - 1;

            }else {
                return mid;
            }
        } return -1;
    }
}

//