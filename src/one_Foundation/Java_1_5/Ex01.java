package one_Foundation.Java_1_5;

public class Ex01 {
    private static int[] id = {0,1,2,3,4,5,6,7,8,9};
    private static int count = id.length;
    public static int find(int p){
        return id[p];
    }

    public static void quick_find(int p,int q){
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
    //0 2 2 0 0 2 6 2 2 0
    public static void main(String[] args) {
        int [][] a = {{9,0},{3,4},{5,8},{7,2},{2,1},{5,7},{0,3},{4,2}};

        for (int i = 0 ; i < a.length;i++){
            quick_find(a[i][0],a[i][1]);
        }

        for (int i = 0 ; i < id.length;i++){
            System.out.println(id[i]);
        }
    }
}
