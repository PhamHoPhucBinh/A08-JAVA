package _13_Searching_Algorithm.pratice;

public class BinarySearch {
    static int[] list = {2, 4, 8, 9, 14, 55, 89, 121};

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
//            System.out.println(high);
            int mid = (low + high) / 2;
//            System.out.println(mid);
            if (key < list[mid]) {
                high = mid - 1;
            }else if (key == list[mid]) {
                return mid;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,121));
//        System.out.println(binarySearch(list,121));
//        System.out.println(binarySearch(list,99));
    }
}

