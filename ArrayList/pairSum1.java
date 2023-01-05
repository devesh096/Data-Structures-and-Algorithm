import java.util.*;

public class pairSum1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // 2 pointer approach

        pairSum(list, 3);

    }

    private static boolean pairSum(ArrayList<Integer> list, int sum) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == sum) {
                System.out.println("Pair Found at Index " + lp + " " + rp + " i.e ");
                System.out.println(list.get(lp) + " + " + list.get(rp) + " = " + sum);
                return true;

            } else if (list.get(lp) + list.get(rp) > sum) {
                rp--;
            } else if (list.get(lp) + list.get(rp) < sum) {
                lp++;
            }
        }
        System.out.println("Pair Not Found ");
        return false;
    }
}
