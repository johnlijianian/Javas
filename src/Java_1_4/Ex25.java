package Java_1_4;

public class Ex25 {
    static int max(int a, int b) { return (a > b)? a: b; }

    private static int computeMinDropsInWorstCase(int eggs, int floors) {
//        table 表示最坏情况下的最少尝试次数
        int table[][]=new int[eggs+1][floors+1];

        for (int i = 0;i <= eggs;i ++){
            table[i][1] = 1;
            table[i][0] = 0;
        }

//        只有一个鸡蛋
        for (int i = 1;i <= floors; i ++){
            table[1][i] = i;
        }

        for (int i = 2;i <= eggs ; i++){
            for (int j = 2;j <= floors;j ++){
                table[i][j] = Integer.MAX_VALUE;  // so important
                for (int floorTriedFirst = 1; floorTriedFirst <= j; floorTriedFirst++) {
                    int res = 1+max(table[i-1][floorTriedFirst-1],
                            table[eggs][j-floorTriedFirst]);
                    if(res < table[i][j])
                    {
                        table[i][j] = res;
                    }
                }
            }
        }
        return table[eggs][floors];
    }

    public static void main(String[] args) {
        int eggs = 2;
        int floor = 100;

        System.out.println(computeMinDropsInWorstCase(eggs,floor));
    }
}
