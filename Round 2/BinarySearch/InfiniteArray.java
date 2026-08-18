public class InfiniteArray{
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,8,12,23,34,57,89,100};
        int target = 89;
        System.out.println(findindex(arr,target));

    }
    public static int findindex(int[] arr,int target) {
        int start = 0;
        int end = 1;
        while(target > arr[end]) {
            int newstart = end+1;
            end = end + (end-start+1) * 2;
            start = newstart;
        }
        return binarySearch(arr,target,start,end);
    }
    public static int binarySearch(int [] arr,int target,int start,int end) {
        while(start <= end) {
            int mid = start + (end - start)/2;
            if(target > arr[mid]) {
                start = mid + 1;
            }
            else if(target < arr[mid]) {
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}