import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.*;

class Test {

    static void initializeMap(int[][] map, int rowCol, BufferedReader br) throws Exception {
        for(int y=0; y<rowCol; y++) {
            String value = br.readLine();
            for(int x=0; x<rowCol; x++) {
                if(value.charAt(x) == 'M') {
                    map[y][x] = 0;
                } else {
                    map[y][x] = 1;
                }
            }
        }
    }

    static void transformMuse(int[][] map, int y, int x, String path) {
        if(map[y][x] == 1) {
            path = "SPAM";
        } else {
            Queue<int[]> steps = new LinkedList<int[]>();
            steps.add(new int[]{y,x});
            while(!steps.isEmpty()) {

            }
        }
    }

    
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("./input.txt"));
        int testCases = Integer.parseInt(br.readLine());
        StringTokenizer st = new java.util.StringTokenizer(br.readLine());
        int rowCol = Integer.parseInt(st.nextToken());
        int museY = Integer.parseInt(st.nextToken());
        int museX = Integer.parseInt(st.nextToken());
        
        for(int test=0; test<testCases; test++) {
            int[][] map = new int[rowCol][rowCol];
            initializeMap(map, rowCol, br);
            String answer = "";
            

        }
        
    }
}