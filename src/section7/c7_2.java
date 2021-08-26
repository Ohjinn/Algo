package section7;

public class c7_2 {
    private void DFS(int n){
        if(n == 0) return;
        else{
            DFS(n/2);
            System.out.println(n % 2 + " ");
        }
    }

    public static void main(String[] args) {
        c7_2 T = new c7_2();
        T.DFS(11);
    }
}
