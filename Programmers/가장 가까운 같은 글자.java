// 프로그래머스 , 가장 가까운 같은 글자, Java
import java.util.*;
class Solution {
    public int[] solution(String s) {
        HashMap<Character, Integer> sDict = new HashMap<>();
        int[] answer = new int[(s.length())];
        for(int i = 0; i < s.length(); i++){
            Character letter = s.charAt(i);
            Integer before = sDict.get(letter);
            if(before != null){ // HashMap.contaisKey(Character);
                answer[i] = i - before; // HashMap.get(Character);
                sDict.put(letter, i);
            }
            else{
                answer[i] = -1;
                sDict.put(letter, i); // HashMap.put(key , val)
            }
        }
        return answer;
    }
}

/*
Java HashMap 사용법 (파이썬 dict와 비슷)

HashMap<keyType, valType> map = new HashMap<>();
map.get(KEY);
map.put(KEY, VAL);
map.containsKey(KEY);

 */