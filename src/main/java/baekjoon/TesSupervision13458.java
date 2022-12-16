package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TesSupervision13458 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int classroom = Integer.parseInt(st.nextToken());
        int[] students = new int[classroom];

        st = new StringTokenizer(br.readLine(), " ");
        for (int i=0; i<classroom; i++) {
            students[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        long result = 0;
        for (int i=0; i<classroom; i++) {
            int n = 1;

            // 부감독관이 필요없을때
            if(students[i] - B <= 0) {
                result ++;
                continue;
            }
            // 부감독관이 필요할때
            n += (students[i]-B) / C;
            if((students[i]-B) % C > 0) {
                n ++;
            }
            result += n;
        }
        System.out.printf("%d", result);
    }
}
