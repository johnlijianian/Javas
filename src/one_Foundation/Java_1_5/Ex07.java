package one_Foundation.Java_1_5;

public class Ex07 {
    public class QuickFindUF{
        private int []id;
        private int count;

        public QuickFindUF(int N){
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
            return id[p];
        }
        public boolean connected(int p,int q){
            return find(p) == find(q);
        }

        public void union(int p,int q){
            int pId = find(p);
            int qId = find(q);

            if (pId == qId) return ;

            else{
                for (int i = 0 ; i < id.length ; i++){
                    if (id[i] == pId) id[i] = qId;
                }
                count--;
            }
        }
    }

    public class QuickUnionUF{
        private int []id;
        private int count;

        public QuickUnionUF(int N){
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
            while (p != id[p])
                p = id[p];
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
