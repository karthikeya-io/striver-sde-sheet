import java.util.Arrays;

class NextPermutation {
    public void nextPermutation(int[] nums) {
        int brk = -1;
        for (int i = nums.length-1; i > 0; i--) {
            if (nums[i] > nums[i-1]) {
                brk = i-1;
                break;
            }
        }
        if (brk == -1) {
            // reverse in place
            for (int i = 0; i < nums.length/2; i++) {
                int temp = nums[i];
                nums[i] = nums[nums.length - 1 - i];
                nums[nums.length - 1 - i] = temp;
            }
            return;
        }
        int small = 101;
        int smallIndx = -1;
        for (int i = brk+1; i < nums.length; i++ ) {
            if (nums[i] > nums[brk] && nums[i] < small) {
                small = nums[i];
                smallIndx = i;
            }
        }

        // for (int i = nums.length-1; i > brk; i--) {
        //     if (nums[i] > nums[brk]) {
        //         small = nums[i];
        //         smallIndx = i;
        //     }
        // }
        nums[smallIndx] = nums[brk];
        nums[brk] = small;
        Arrays.sort(nums, brk+1, nums.length);
              
    }
}

public class NextPermutationDemo {
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 4, 3, 0, 0};
        NextPermutation np = new NextPermutation();
        np.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}

// Complexity
// time: O(NlogN )
// TODO: work on O(N) solution
// space: O(1)
