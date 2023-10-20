package GFG;

public class divBy3UsingArray {
    class Solution {
        static int isPossible(int n, int arr[]) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                int number = arr[i];
                while (number > 0) {
                    sum += number % 10;
                    number /= 10;
                }
            }
            return (sum % 3 == 0 ? 1 : 0);
        }
    }
}
