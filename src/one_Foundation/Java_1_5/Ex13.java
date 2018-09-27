package one_Foundation.Java_1_5;

import javafx.scene.Parent;

public class Ex13 {
    private int [] sz ;
    private int [] id ;
    private int count;

    public Ex13(int N){
        count = N;
        id = new int[N];
        sz = new int[N];

        for (int i = 0; i < N ; i ++) {
            id[i] = i;
            sz[i] = 1;
        }
    }

    public int count(){
        return count;
    }

    public int find(int p){
        int pParent = p;
        while(id[pParent]!=pParent){
            pParent=id[pParent];
        }

        while(pParent != p){
            int newp = id[p];
            id[p] = pParent;
            p = newp;
        }

        return pParent;
    }

    public boolean connected(int p, int q){
        return find(p)== find(q);
    }

    public void union(int p, int q){
        int pRoot = find(p);
        int qRoot = find(q);

        if (pRoot!=qRoot) {
            if (sz[pRoot] < sz[qRoot]) {
                id[pRoot] = qRoot;
                sz[qRoot] += sz[pRoot];
            }else {
                id[qRoot] = pRoot;
                sz[pRoot] += sz[qRoot];
            }
            count--;
        }
    }
}
