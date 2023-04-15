package GFG;

import java.util.*;

public class findTotalTimeTaken {

    public static long totalTime(int n, int arr[], int time[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        long cache[] = new long[n];
        hm.put(arr[0], 0);
        cache[0] = 0;
        for (int i = 1; i < n; i++) {
            if (hm.containsKey(arr[i])) {
                long currentTime = cache[i - 1] + 1;
                long previousTime = cache[hm.get(arr[i])];
                long waited = currentTime - previousTime;
                if (waited < time[arr[i] - 1]) {
                    currentTime += time[arr[i] - 1] - waited;
                }
                cache[i] = currentTime;
                hm.put(arr[i], i);
            } else {
                hm.put(arr[i], i);
                cache[i] = cache[i - 1] + 1;
            }
        }
        return cache[n - 1];
    }
}
