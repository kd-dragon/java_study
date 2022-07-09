package linearSearch;

import java.util.Arrays;

public class LinearSearchAlgorithm {

    public boolean phoneNumberList(String[] phone_book) {
        boolean answer = true;

        // 119
        // 97674223
        // 1195524421

        /*
            for(String s1 : phone_book) {
                for(String s2 : phone_book) {
                    if(s1.equals(s2)) continue;
                    if(s1.startsWith(s2)) return false;
                }
            }
         */

        //*Sort 를 활용하기. 접두어가 있으면 같이 붙게된다.
        Arrays.sort(phone_book);
        for(int i=1; i<phone_book.length; i++) {
            if(phone_book[i].startsWith(phone_book[i-1])) return false;
        }

        return answer;
    }

    public boolean pyCounting(String s) {
        boolean answer = true;

        String lower = s.toLowerCase();

        int sum = 0;
        for(char c : lower.toCharArray()) {
            if(c == 'p') sum++;
            else if(c == 'y') sum--;
        }

        return sum == 0;
    }

    public int skillTree(String skill, String[] skill_trees) {
        // skill 외 문자를 모두 없애버린다.
        int answer = 0;
        for(String s : skill_trees) {
            String s2 = s.replaceAll("[^"+skill+"]", ""); //정규식동적으로 사용

            //접두사를 확인!
            if(skill.startsWith(s2)) answer++;
        }
        return answer;
    }

    public int skillTree2(String skill, String[] skill_trees) {

        return (int) Arrays.stream(skill_trees)
                .map(s -> s.replaceAll("[^"+skill+"]", ""))
                .filter(s -> skill.startsWith(s))
                .count();
    }
}
