import java.util.*;

public class pairSum2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // sorted and rotated list
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        // 2 pointer approach

        pairSum(list, 16);

    }

    private static boolean pairSum(ArrayList<Integer> list, int sum) {
        int lp = 0;
        int rp = list.size() - 1;
        int n = list.size();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < list.get(i + 1) == false) {

                rp = i;
                lp = i + 1;
                break;
            }

        }
        System.out.println("Pivot = " + rp);

        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == sum) {
                System.out.println("Pair Found at Index " + lp + " " + rp + " i.e ");
                System.out.println(list.get(lp) + " + " + list.get(rp) + " = " + sum);
                return true;

            } else if (list.get(lp) + list.get(rp) > sum) {
                rp = (n + rp - 1) % n;
            } else if (list.get(lp) + list.get(rp) < sum) {
                lp = (lp + 1) % n;
            }
        }
        System.out.println("Pair Not Found ");
        return false;
    }
}
