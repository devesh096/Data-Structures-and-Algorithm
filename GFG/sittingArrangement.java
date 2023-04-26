class Solution{
    public static boolean is_possible_to_get_seats(int n, int m, int[] seats) {
        int available_seats = 0;
        for (int i = 0; i < m; i++) {
            int prev;
            if(i == 0)
                prev = 0;
            else
                prev = seats[i - 1];
            int next;
            if(i == m - 1)
                next = 0;
            else
                next = seats[i + 1];
            if (prev + next + seats[i] == 0) {
                available_seats++;
                i++;
            } 
        }
        return available_seats >= n;
    }
}
