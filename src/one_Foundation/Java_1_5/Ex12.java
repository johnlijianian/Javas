package one_Foundation.Java_1_5;

public class Ex12 {
    public class QuickUnionPathUF{
        private int []id;
        private int count;

        public QuickUnionPathUF(int N){
            count = N;
            id = new int[N];
            for (int i = 0;i < N;i++){
                id[i] = i;
            }
        }

        public int count(){
            return count;
        }

        public int find(int p){
            int pParent = p;
            while (pParent != id[pParent])
                pParent = id[pParent];
            while (p != id[p]) {
                p = id[p];
                id[p] = pParent;
            }
            return p;
        }
        public boolean connected(int p,int q){
            return find(p) == find(q);
        }

        public void union(int p,int q){
            int pRoot = find(p);
            int qRoot = find(q);
            if (pRoot == qRoot) return ;

            id[pRoot] = qRoot;

            count--;
        }
    }
}
