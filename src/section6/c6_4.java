package section6;

import java.util.ArrayList;
import java.util.Scanner;

public class c6_4 {

    private ArrayList solution(int a, int b, int[] arr) {
        ArrayList<Integer> cache = new ArrayList<>();
        for(int i = 0; i < b; i++){
            int tmp = arr[i];
            if((cache.size() < a) && (!cache.contains(tmp))) cache.add(0, arr[i]);
            else if(cache.contains(tmp)) {
                int idx = cache.indexOf(tmp);
                cache.remove(idx);
                cache.add(0, arr[i]);
            }
            else{
                cache.remove(a - 1);
                cache.add(0, tmp);
            }
        }
        return cache;
    }

    private int[] solution4_1(int size, int n, int[] arr){
        int[] cache = new int[size];
        for(int x : arr){
            int pos = -1;
            for(int i = 0; i < size; i++) if(x == cache[i]) pos = i;
            if(pos == -1){
                for(int i = size - 1; i >= 1; i--){
                    cache[i] = cache[i-1];
                }
            }
            else{
                for(int i = pos; i >= 1; i--){
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = x;
        }
        return cache;
    }

    public static void main(String[] args) {
        c6_4 T = new c6_4();
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int[] arr = new int[b];
        for (int i = 0; i < b; i++) arr[i] = kb.nextInt();
        ArrayList arr2 = T.solution(a, b, arr);
        for(int i = 0; i < a; i++) System.out.print(arr2.get(i) + " ");
    }
}
