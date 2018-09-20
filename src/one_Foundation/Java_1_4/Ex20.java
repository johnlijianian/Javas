package one_Foundation.Java_1_4;

public class Ex20 {
    public static int bothway(int[] a, int find) {
        int left = 0;
        int right = a.length - 1;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if (a[mid] == find) {
                return mid;
            }

            int index;
            if (a[mid] > a[mid - 1] && find < a[mid]) {
                index = Ex20.BinarySearch.rank_up(find, a, left, mid);
                if (index != -1) {
                    return index;
                }

                left = mid + 1;
            }

            if (a[mid] < a[mid - 1] && find < a[mid]) {
                index = Ex20.BinarySearch.rank_low(find, a, mid, right);
                if (index != -1) {
                    return index;
                }

                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 10, 9, 8, 7, 6};
        int find = 4;
        System.out.println(bothway(a, find));
    }

    public static class BinarySearch {
        public BinarySearch() {
        }

        public static int rank_up(int key, int[] a, int lo, int hi) {
            while(true) {
                if (lo <= hi) {
                    int mid = (lo + hi) / 2;
                    if (key < a[mid]) {
                        hi = mid - 1;
                        continue;
                    }

                    if (key > a[mid]) {
                        lo = mid + 1;
                        continue;
                    }

                    return mid;
                }

                return -1;
            }
        }

        public static int rank_low(int key, int[] a, int lo, int hi) {
            while(true) {
                if (lo <= hi) {
                    int mid = (hi + lo) / 2;
                    if (key > a[mid]) {
                        hi = mid - 1;
                        continue;
                    }

                    if (key < a[mid]) {
                        lo = mid + 1;
                        continue;
                    }

                    return mid;
                }

                return -1;
            }
        }
    }
}
