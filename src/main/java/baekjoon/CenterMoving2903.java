package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CenterMoving2903 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int answer = 2;
        int input = Integer.parseInt(st.nextToken());

        for(int i=0; i<input; i++) {
            answer += (int)(Math.pow(2, i));
        }

        answer *= answer;

        System.out.printf("%d", answer);
    }
}
