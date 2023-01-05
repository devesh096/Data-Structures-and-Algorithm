import java.util.*;

public class containerWithMostWater {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int maxWater = 0;
        maxWater = Integer.MIN_VALUE;
        for (int i = 0; i < height.size(); i++) {
            for (int j = 0; j < height.size(); j++) {

                int water = (j - i) * Math.min(height.get(i), height.get(j));

                if (maxWater < water) {
                    maxWater = water;
                }

                System.out.println("Water Stored at [" + i + "][" + j + "] = " + maxWater);
            }
        }

        System.out.println("Maximum Water Capacity = " + maxWater);

    }
}
