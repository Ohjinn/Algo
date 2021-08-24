package section6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Position implements Comparable<Position>{
    int x;
    int y;
    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Position position){
        if(this.x == position.x) return this.y-position.y;
        else return this.x - position.x;

    }
    /*
    @Override
    public int compareTo(Position o) {
        if(this.x < o.x){
            return -1;
        }else if(this.x == o.x){
            if(this.y < o.y){
                return -1;
            }else if(this.y > o.y) return 1;
        }else return 1;
        return 0;
    }

     */
}

public class c6_7 {

    private ArrayList<Position> solution(int size, ArrayList<Position> position) {
        Collections.sort(position);

        return position;
    }

    public static void main(String[] args) {
        c6_7 T = new c6_7();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Position> positions = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            positions.add(new Position(a, b));
        }
        ArrayList<Position> arr = T.solution(n, positions);
        for(int i = 0; i < n; i++) System.out.println(arr.get(i).x + " " + arr.get(i).y);
    }
}
