package GFG;

import java.util.Deque;
import java.util.LinkedList;

public class ticketCounter {

    class Solution {
        public static int distributeTicket(int N, int K) {
            Deque<Integer> dq = new LinkedList<>();
            for (int i = 1; i <= N; i++) {
                dq.addLast(i);
            }
            int ans = 0;
            System.out.println(ans);
            int turn = 0;
            while (dq.size() > 1) {
                if (turn == 0) {
                    int in = 0;
                    while (dq.size() > 1 && in < K) {
                        ans = dq.pollFirst();
                        in++;
                    }
                } else {
                    int in = 0;
                    while (dq.size() > 1 && in < K) {
                        ans = dq.pollLast();
                        in++;
                    }
                }
                turn ^= 1;
            }
            return dq.pollFirst();
        }
    }

}
