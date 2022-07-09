package set;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetAlgorithmPractice {

    public boolean validateLotto(int[] lotto) {
        Set<Integer> lottoSet = new HashSet<>();

        for (int num : lotto) {
            if(num < 1 || num > 45) return false;
            lottoSet.add(num);
        }

        return lottoSet.size() == 6;
    }

    public boolean endTalk(String[] words) {
        //Set 에 담기
        Set<String> wordSet = new HashSet<>();
        for (String word : words) {
            wordSet.add(word);
        }

        // 중복 검사
        if (words.length != wordSet.size()) {
            return false;
        }

        // 단어 끝 글자 == 다음 단어 첫 글자
        char prev = words[0].charAt(words[0].length()-1);
        for (int i=1; i<words.length; i++) {
            if (prev != words[i].charAt(0)) return false;

            prev = words[i].charAt(words[i].length()-1);
        }

        return true;
    }

    public int[] hateSameNumber(int[] arr) {
        List<Integer> list = new LinkedList<>();
        int last = -1;
        for(int i=0; i<arr.length; i++) {
            if(last == arr[i]) continue;
            last = arr[i];
            list.add(arr[i]);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

}
