package GFG;

import java.util.*;

public class taxiBooking {

    public static int minimumTime(int N, int cur, int[] pos, int[] time) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < N; i++) {
            int Indivtime = calculateTime(cur, pos[i], time[i]);
            list.add(Indivtime);

        }

        return Collections.min(list);
        // code here
    }

    public static int calculateTime(int cur, int pos, int time) {
        int distance = Math.abs(cur - pos);
        int timeTaken = distance * time;

        return timeTaken;
    }
}
