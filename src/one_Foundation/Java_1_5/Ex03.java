package one_Foundation.Java_1_5;

import sun.jvm.hotspot.ui.action.FindAction;

public class Ex03 {
    private int [] id ;
    private int [] sz;
    private int count;

    public Ex03(int N){
        count = N;
        id = new int[N];
        sz = new int[N];
        for (int i = 0; i < N ; i++)
            id[i] = i;
        for (int i = 0; i < N ; i++)
            sz[i] = 1;
    }

    public int count(){
        return count;
    }

    public boolean connected(int p,int q){
        return find(p) == find(q);
    }

    private int find(int p){
        while (p != id[p]) p = id[p];
        return p;
    }

    public void union(int p,int q){
        int i = find(p);
        int j = find(q);
        if (i == j) return;

        if (sz[i] < sz[j]) {id[i] = j; sz[j] += sz[i];}
        else {id[j] = i; sz[i] += sz[j];}
        count --;
    }

    public void show(){
        for (int i = 0;i < id.length;i ++)
            System.out.println(id[i]);
    }

    public static void main(String[] args) {
        Ex03 ex03 = new Ex03(10);

        int[][] a = {{9, 0}, {3, 4}, {5, 8}, {7, 2}, {2, 1}, {5, 7}, {0, 3}, {4, 2}};

        for (int i = 0 ; i < a.length;i++){
            ex03.union(a[i][0],a[i][1]);
        }

        ex03.show();
    }
}
