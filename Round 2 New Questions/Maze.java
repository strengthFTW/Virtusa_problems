/*
6. Maze of People
Problem DescripƟon:
People are standing in an endless queue waiƟng to enter a maze.
Every second:
 The person currently in the 1st posiƟon enters the maze.
 The person currently in the 3rd posiƟon also enters.
 The person in posiƟon 2 moves to posiƟon 1.
 PosiƟon 4 moves to posiƟon 2.
 PosiƟon 5 moves to posiƟon 3, and so on.
Given your iniƟal posiƟon N in the queue, determine how many seconds it takes for you to enter the
maze.
Input: StarƟng posiƟon N.
Output: Number of seconds required.
Example:
N = 5 → Output: 2
Other supplied results include N=1 → 1, N=3 → 1, N=7 → 3, and N=10 → 5. */
import java.util.Scanner;
public class Maze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 1 || n == 2) {
             System.out.println(1);;
        }
        else{
            System.out.println(n/2);
        }
    }
    
}
