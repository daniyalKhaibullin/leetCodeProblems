public class Binarys{
	public int searchInsert(int[] nums, int target) {
		int result = 0;
    boolean found = false; // Initialize found as false
    int left = 0, right = nums.length - 1;
    int middle = 0; // Initialize middle here

    while (left <= right) { // Adjusted loop condition
        middle = left + (right - left) / 2;
        if (nums[middle] < target) {
            left = middle + 1;
        } else if (nums[middle] > target) {
            right = middle - 1;
        } else {
            found = true;
            result = middle;
            break; // Exit loop if found
        }
    }

    if (!found) {
        result = (nums[middle] < target) ? middle + 1 : middle;
    }
    return result;
  }
	public static void main(String[] args){
		Binarys bs = new Binarys();
		int[] nums = {1,3};
		int target = 0;
		int result = bs.searchInsert(nums, target);
		System.out.println(result);
	}
}