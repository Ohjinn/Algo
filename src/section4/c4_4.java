package section4;

import java.util.HashMap;
import java.util.Scanner;

public class c4_4 {
    private int solution(String a, String b){
        int answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> eq = new HashMap<>();
        for(int i = 0; i < b.length()-1; i++)
            map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0) + 1);
        for(int i = 0; i < b.length(); i++){
            eq.put(b.charAt(i), eq.getOrDefault(b.charAt(i), 0) + 1);
        }

        int lt = 0;
        for(int i = b.length() - 1; i < a.length(); i++){
            map.put(a.charAt(i), map.getOrDefault(a.charAt(i), 0) + 1);
            if(map.equals(eq)) answer++;
            map.put(a.charAt(lt), map.get(a.charAt(lt))-1);
            if(map.get(a.charAt(lt)) == 0) map.remove(a.charAt(lt));
            lt++;
        }
        return answer;
    }


    public static void main(String[] args) {
        c4_4 T = new c4_4();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.print(T.solution(a, b));
    }
}
