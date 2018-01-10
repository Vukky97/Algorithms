package co.btksoftware.towers_of_hanoi;

public class TowersOfHanoi {

    public static void main(String[] args) {
        // we're moving the disks from rod 1 to rod 3,
        // while the second rod is the helper
        Hanoi(3, "1. rod", "3. rod", "2. rod");
    }

    private static void Hanoi(int N, String source, String destination, String helper) {
        if (N > 0) {
            Hanoi(N - 1, source, helper, destination);
            System.out.println(N + ". moving disk " + source + " -> " + destination);
            Hanoi(N - 1, helper, destination, source);
        }
    }
}
