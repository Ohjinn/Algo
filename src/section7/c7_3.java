package section7;

public class c7_3 {

    private int DFS(int n){
        if(n == 1) return 1;
        else return n*DFS(n-1);
    }

    public static void main(String[] args) {
        c7_3 T = new c7_3();
        System.out.println(T.DFS(5));
    }
}
