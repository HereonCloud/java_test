import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("/workspaces/java_test/graph-theory-star-delivery/sample3_input.txt"));
        
        String[] count = br.readLine().split(" ");
        
        int numberOfWarpRoutes = Integer.parseInt(count[1]);
        int numberOfQueries = Integer.parseInt(count[2]);
        Map<Integer, ArrayList<Integer>> warpMap = new HashMap<>();
        
        
        // Create hashmap next route
        for(int c=0; c<numberOfWarpRoutes; c++) {
            String[] warpInputs = br.readLine().split(" ");
            int key = Integer.parseInt(warpInputs[0]);
            int value = Integer.parseInt(warpInputs[1]);

            if(warpMap.containsKey(key)) {
                ArrayList<Integer> warpValue = warpMap.get(key);
                warpValue.add(value);
                warpMap.put(key, warpValue);
            } else {
                ArrayList<Integer> warpMapValue = new ArrayList<Integer>();
                warpMapValue.add(value);
                warpMap.put(key, warpMapValue);
            }
        }

        // Test routes
        for(int q = 0; q < numberOfQueries; q++) {
            Map<Integer, Integer> visitedCount = new HashMap<>();
            String[] fromTo = br.readLine().split(" ");
            int from = Integer.parseInt(fromTo[0]);
            int to = Integer.parseInt(fromTo[1]);
            
            Deque<int[]> checker = new ArrayDeque<>();
           
            checker.add(new int[]{from, 0});
            int finalCount = 0;
            
            while(!checker.isEmpty()) {
                int[] currentRoute = checker.pop();
                visitedCount.put(currentRoute[0], currentRoute[1]);
                ArrayList<Integer> routes = warpMap.get(currentRoute[0]);
                
                if(routes == null) {
                    break;
                }

                for(Integer r : routes) {
                 
                    if(r == to) {
                        finalCount = currentRoute[1] + 1;
                        checker.clear();
                    } else if(!visitedCount.containsKey(r)) {
                    
                        checker.add(new int[]{r,currentRoute[1] + 1});
                        visitedCount.put(currentRoute[0], currentRoute[1] + 1);
                    } else {
                    
                        continue;
                    }
                }
            }
            System.out.println(finalCount == 0 ? "unreachable":finalCount);

        }
        br.close();
    }
}
