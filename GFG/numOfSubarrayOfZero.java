package GFG;

public class numOfSubarrayOfZero {

    long no_of_subarrays(int N, int[] arr) {
        long count = 0, answer = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == 0) {
                count++;
            } else {
                answer += ((count * (count + 1)) / 2);
                count = 0;
            }
        }
        answer += ((count * (count + 1)) / 2);
        return answer;
    }
}
