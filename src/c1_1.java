import java.util.Scanner;
//find how many words are existing in the sentence
class c1_1{
    private int solution(String str, char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        for(char x : str.toCharArray()){
            if(x==t) answer++;
        }


        return answer;
    }

    public static void main(String[] args) {
        c1_1 T = new c1_1();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.println(T.solution(str, c));
    }

}