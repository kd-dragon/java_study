package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GodOfParking3086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        int testCount = Integer.parseInt(br.readLine());
        int[] totalDistances = new int[testCount];

        for (int i=0; i<testCount; i++) {
            int marketCount = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine()," ");

            int max = Integer.parseInt(st.nextToken());
            int min = max;
            for (int j=0; j<marketCount-1; j++) {
                int marketPos = Integer.parseInt(st.nextToken());
                if (marketPos > max) {
                    max = marketPos;
                }
                if (marketPos < min) {
                    min = marketPos;
                }
            }
            totalDistances[i] = (max-min) * 2;
        }

        for (int output : totalDistances) {
            System.out.println(output);
        }
    }
}
