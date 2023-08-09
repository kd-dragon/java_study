package hackerRank;

import java.util.*;
import java.util.stream.Collectors;

public class PreparationWeek1 {

    public String timeConversion(String s) {
        if(s.contains("PM")) {
            String arr[] = s.replace("PM", "").split(":");
            if(!arr[0].equals("12")) arr[0] = String.valueOf(Integer.parseInt(arr[0]) + 12);
            return String.join(":", arr);
        }
        String arr[] = s.replace("AM", "").split(":");
        if(arr[0].equals("12")) arr[0] = "00";
        return String.join(":", arr);
    }

    public List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> result = new LinkedList<>();

        for(int i=0; i<queries.size(); i++) {
            String query = queries.get(i);
            result.add((int) strings.stream()
                    .filter(s -> s.equals(query))
                    .count());
        }

        for(double r : result) {
            System.out.printf("%.6f\n", r);
        }
        return result;
    }

    public int lonelyInteger(List<Integer> a) {
        Map<Integer, Integer> map = new HashMap<>();
        a.stream().forEach(n -> map.put(n, map.getOrDefault(n, 0) + 1));

        return map.keySet().stream()
                .filter(n -> map.get(n) == 1)
                .findFirst()
                .orElse(-1)
                .intValue();
    }

    public long flippingBits(long n) {

        // create char array for 32 bits unsigned integers
        char[] binaryChars = new char[32];

        // fill zero all over array
        Arrays.fill(binaryChars, '0');

        // convert input N to BinaryString
        String binaryString = Long.toBinaryString(n);

        // update the char array. e.g. 1001 -> 00000000000000000000000000001001
        for(int i=0; i<binaryString.length(); i++) {
            binaryChars[binaryChars.length - (binaryString.length()-i)] = binaryString.charAt(i);
        }
        System.out.println(String.valueOf(binaryChars));

        // flip (reverse) the bits of binary and append to String Builder.
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<binaryChars.length; i++) {
            sb.append(binaryChars[i] == '0' ? 1 : 0);
        }
        System.out.println(sb);

        // parse flipped BinaryString to Long and return
        return Long.parseLong(sb.toString(), 2);
    }

    public int diagonalDifference(List<List<Integer>> arr) {

        int n = arr.size();

        int result = 0;
        for(int i=0; i<n; i++) {
            result += arr.get(i).get(i);
            result -= arr.get(i).get((n-(i+1)));
        }
        System.out.println(result);
        return Math.abs(result);
    }

    public List<Integer> countingSort(List<Integer> arr) {

        // * result size MUST BE 100. -> Max(arr[i]) == 100
        List<Integer> result = new ArrayList<>(100);
        for(int i=0; i<100; i++) {
            result.add(0);
        }

        arr.stream().forEach(v -> {
            result.set(v, result.get(v) + 1);
        });

        return result;
    }

    public String pangrams(String s) {
        String message = s.toLowerCase().trim().replaceAll("\\s","");
        Set<Character> set = message.chars().mapToObj(e -> (char)e).collect(Collectors.toSet());
        List<Character> alphabet = List.copyOf(set);

        if(alphabet.size() < 26) return "not pangram";
        for (int i=0; i<alphabet.size(); i++) {
            if((int)alphabet.get(i) != (97 + i)) return "not pangram";
        }
        return "pangram";
    }

    public String twoArrays(int k, List<Integer> A, List<Integer> B) {
        Collections.sort(A);
        Collections.sort(B, Collections.reverseOrder());

        for(int i=0; i<A.size(); i++) {
            if(A.get(i) + B.get(i) < k) return "NO";
        }

        return "YES";
    }
}
