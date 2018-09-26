package one_Foundation.Java_1_5;

public class Ex12 {
    private int [] sz ;
    private int [] id ;
    private int count;

    public Ex12(int N){
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

        while(id[p]!= p){
            p=id[p];
            id[p]=pParent;
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