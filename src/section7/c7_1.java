package section7;

public class c7_1 {

    public void DFS(int n){
        if(n == 0) return;
        else{
            DFS(n-1);
            System.out.println(n + " ");
        }
    }

    public static void main(String[] args) {
        c7_1 T = new c7_1();
        T.DFS(3);
    }
}
