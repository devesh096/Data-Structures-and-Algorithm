import java.util.ArrayList;
import java.util.List;

public class courseSchedule {

    class Solution {
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            List<List<Integer>> graph = new ArrayList<>();
            for (int i = 0; i < numCourses; i++) {
                graph.add(new ArrayList<>());
            }

            for (int[] pair : prerequisites) {
                int course = pair[0];
                int prerequisite = pair[1];
                graph.get(course).add(prerequisite);
            }

            int[] visited = new int[numCourses]; // 0 - not visited, 1 - visiting, 2 - visited

            for (int course = 0; course < numCourses; course++) {
                if (hasCycle(course, visited, graph)) {
                    return false;
                }
            }

            return true;
        }

        private boolean hasCycle(int course, int[] visited, List<List<Integer>> graph) {
            if (visited[course] == 1) {
                return true;
            }
            if (visited[course] == 2) {
                return false;
            }

            visited[course] = 1;
            for (int prerequisite : graph.get(course)) {
                if (hasCycle(prerequisite, visited, graph)) {
                    return true;
                }
            }

            visited[course] = 2;
            return false;
        }
    }
}
