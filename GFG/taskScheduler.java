package GFG;

public class taskScheduler {
    class Solution {
        static int leastInterval(int n, int K, char tasks[]) {
            // code here
            int[] counter = new int[26];
            int max = 0;
            int maxCount = 0;
            for (char task : tasks) {
                counter[task - 'A']++;
                if (max == counter[task - 'A']) {
                    maxCount++;
                } else if (max < counter[task - 'A']) {
                    max = counter[task - 'A'];
                    maxCount = 1;
                }
            }

            int partCount = max - 1;
            int partLength = K - (maxCount - 1);
            int emptySlots = partCount * partLength;
            int availableTasks = tasks.length - max * maxCount;
            int idles = Math.max(0, emptySlots - availableTasks);

            return tasks.length + idles;
        }
    }
}
