package one_Foundation.Java_1_5;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex14 {
    public static class WeightedQuickUnionByHeightUF{
        private int[] height;
        private int[] id;
        private int count;

        WeightedQuickUnionByHeightUF(int N){
            count = N;

            id = new int[N];
            height = new int[N];
            for (int i = 0; i < count ; i++){
                id[i] = i;
                height[i] = 0;
            }
        }

        public int count(){
            return count;
        }

        public int find(int p){
            if (p != id[p]){
                p = id[p];
            }
            return p;
        }

        public boolean connected(int p,int q){
            return find(p) == find(q);
        }

        public void union(int p,int q){
            int i = find(p);
            int j = find(q);

            if (i == j) return ;

            if (height[i] < height[j]) id[i] = j;
            else if (height[i] > height[i])id[j] = i;
            else{
                id[j] = i;
                height[i]++;
            }
        }
    }

    public static void main(String[] args) {
        int n = StdIn.readInt();
        WeightedQuickUnionByHeightUF uf = new WeightedQuickUnionByHeightUF(n);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + " components");
    }
}
