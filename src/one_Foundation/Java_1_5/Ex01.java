package one_Foundation.Java_1_5;

public class Ex01 {
    private int[] id ;
    private int count ;
    public Ex01(int N){
        id = new int[N];
        count = N;
        for (int i = 0 ; i < N ; i++)
            id[i] = i;
    }

    public int find(int p){
        return id[p];
    }

    public void quick_find(int p,int q){

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

    public void show(){
        for (int i = 0;i < id.length;i ++)
            System.out.println(id[i]);
    }

    //0 2 2 0 0 2 6 2 2 0
    public static void main(String[] args) {
        int [][] a = {{9,0},{3,4},{5,8},{7,2},{2,1},{5,7},{0,3},{4,2}};

        Ex01 ex01 = new Ex01(10);

        for (int i = 0 ; i < a.length;i++){
            ex01.quick_find(a[i][0],a[i][1]);
        }

        ex01.show();
    }
}
