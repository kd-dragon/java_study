package programmers;

public class MakeHamburger133502 {

    //https://school.programmers.co.kr/learn/courses/30/lessons/133502#

    public int solution(int[] ingredient) {
        int answer = 0;

        String hamburger = "1231";

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<ingredient.length; i++) {
            sb.append(ingredient[i]);
            if(ingredient[i] == 1 && sb.length() > 3) {
                if(sb.substring(sb.length()-4, sb.length()).equals(hamburger)) {
                    sb.delete(sb.length()-4, sb.length());
                    answer ++;
                }
            }
        }

        /*
        *시간초과 오류 발생.
        String str = Arrays.toString(ingredient).replaceAll("[^0-9]","");

        int idx = str.indexOf(hamburger);
        while(idx > -1) {
            str = str.substring(0, idx) + str.substring(idx + hamburger.length());
            answer ++;
            idx = str.indexOf(hamburger);
        }
        */
        return answer;
    }
}
