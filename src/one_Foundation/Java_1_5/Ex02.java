package one_Foundation.Java_1_5;

public class Ex02 {
    private int[] id ;
    private int count ;
    public Ex02(int N){
        id = new int[N];
        for (int i = 0 ;i < N;i ++)
            id[i] = i;
        count = N;
    }


    private int find(int p){
        while (p != id[p]) p = id[p];
        return p;
    }

    public void quick_union(int p,int q){
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot) return ;

        id[pRoot] = qRoot;

        count--;
    }

    public void show(){
        for (int i = 0;i < id.length;i ++)
            System.out.println(id[i]);
    }

    public static void main(String[] args) {
        int[][] a = {{9, 0}, {3, 4}, {5, 8}, {7, 2}, {2, 1}, {5, 7}, {0, 3}, {4, 2}};

        Ex02 ex02 = new Ex02(10);

        for (int i = 0 ; i < a.length;i++){
            ex02.quick_union(a[i][0],a[i][1]);
        }

        ex02.show();
    }
}
