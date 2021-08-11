package section1;

import java.util.Scanner;

public class c1_8 {

    private String solution(String str){
        String answer = "YES";
        str = str.toLowerCase();
        String tmp = new StringBuilder(str).reverse().toString();
        int lt1 = 0, lt2 = 0;
        while(lt1 < tmp.length()){
            if(!Character.isAlphabetic(str.charAt(lt1))){
                lt1++;
            }
            else if(!Character.isAlphabetic(tmp.charAt(lt2))){
                lt2++;
            }
            else{
                if(str.charAt(lt1) != tmp.charAt(lt2)){
                    return "NO";
                }
                else{
                    lt1++;
                    lt2++;
                }
            }
        }
        return answer;
    }

    private String solution8_1(String str){
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");//A-Z가 아니면 대체해라
        String tmp=new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)) answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        c1_8 T = new c1_8();
        Scanner kb = new Scanner(System.in);
        String word = "";
        word = kb.nextLine();

        System.out.println(T.solution(word));
    }
}
