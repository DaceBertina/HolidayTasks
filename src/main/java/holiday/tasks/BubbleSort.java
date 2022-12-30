package holiday.tasks;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        BubbleSort bubble = new BubbleSort();
        bubble.sortArray(nums);

    }
        int [ ] sortArray(int[] nums){
            int a, b, t;
            int size;
            size = nums.length;

            for (a = 1; a < size; a++) {
                System.out.println("\na = " + a);
                for (b = size - 1; b >= a; b--) {
                    System.out.print("\nAt the beginning of one cycle: " + nums[b] + " (b = " + b + ")");
                    System.out.println();
                    if (nums[b - 1] > nums[b]) {
                        t = nums[b - 1];
                        System.out.println("t = " + t);
                        nums[b - 1] = nums[b];
                        System.out.println("b-1 = " + nums[b - 1] + " ==> " + "b = " + nums[b]);
                        nums[b] = t;
                        System.out.println("b " + nums[b] + " ==> " + "t = " + t);
                    }
                    System.out.print("At the end of one cycle: " + nums[b] + " (b = " + b + ")");
                    System.out.println();
                    for (int i = 0; i < size; i++) {
                        System.out.print(" " + nums[i]);
                    }
                    System.out.println();
                }
            }
            System.out.print("\nFinally: ");
            for (int i = 0; i < size; i++)
                System.out.print(" " + nums[i]);
            return nums;
        }
}
