package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Resistance1076 {

    public static void main(String[] args) throws IOException {

        class ColorInfo {
            String value;
            long multiple;

            public ColorInfo(String value, long multiple) {
                this.value = value;
                this.multiple = multiple;
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, ColorInfo> colorMap = new HashMap<>();
        colorMap.put("black", new ColorInfo("0", 1));
        colorMap.put("brown", new ColorInfo("1", 10));
        colorMap.put("red", new ColorInfo("2", 100));
        colorMap.put("orange", new ColorInfo("3", 1000));
        colorMap.put("yellow", new ColorInfo("4", 10000));
        colorMap.put("green", new ColorInfo("5", 100000));
        colorMap.put("blue", new ColorInfo("6", 1000000));
        colorMap.put("violet", new ColorInfo("7", 10000000));
        colorMap.put("grey", new ColorInfo("8", 100000000));
        colorMap.put("white", new ColorInfo("9", 1000000000));

        int resist = Integer.parseInt(colorMap.get(br.readLine()).value + colorMap.get(br.readLine()).value);
        long result = resist * colorMap.get(br.readLine()).multiple;
        System.out.println(result);

    }
}
