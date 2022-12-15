// 프로그래머스 , 햄버거만들기, Java
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        int n = ingredient.length;
        int idx = 0;
        int[] stack = new int[n];
        for(int i = 0; i < n; i ++){
            stack[idx++] = ingredient[i];
            while(idx >= 4 && stack[idx-1] == 1 
               && stack[idx-2] == 3
               && stack[idx-3] == 2 
               && stack[idx-4] == 1){
                idx -= 4;
                answer++;
            }
        }
        return answer;
    }
}

/* 

배열을 선언하는 방법
TYPE[] array = new TYPE[SIZE]; // int[] array = new int[10];

*/