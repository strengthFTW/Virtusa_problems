import java.util.*;

public class MinimumMoves_hospital {
    public static void main(String[] args) {
        int arr[] = {5, 3, 1, 0, 2};
        int start = 3;
        System.out.println(MinMoves(arr,start));
    }

    public static int MinMoves(int[] arr, int start) {
        int n = arr.length;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];

        queue.add(start);
        visited[start] = true;

        int moves = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {

                int current = queue.poll();

                if (arr[current] == 0) {
                    return moves;
                }
                int right = current + arr[current];
                int left = current - arr[current];

                if (right >= 0 && right < n && !visited[right]) {
                    visited[right] = true;
                    queue.add(right);
                }
                if (left >= 0 && left < n && !visited[left]) {
                    visited[left] = true;
                    queue.add(left);
                }
            }
            moves++;
            
        }
        return -1;

    }
}
