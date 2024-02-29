import java.util.*;


class Solution {
	public int furthestBuilding(int[] heights, int bricks, int ladders) {
			int left = 0;
			int right = heights.length - 1;
			
			while (left < right) {
					int mid = left + (right - left + 1) / 2; // use ceiling to favor the right side
					
					if (canReach(heights, mid, bricks, ladders)) {
							left = mid;
					} else {
							right = mid - 1;
					}
			}
			
			return left;
	}
	
	private boolean canReach(int[] heights, int target, int bricks, int ladders) {
			PriorityQueue<Integer> ladderUsage = new PriorityQueue<>();
			
			for (int i = 0; i < target; i++) {
					int diff = heights[i + 1] - heights[i];
					if (diff > 0) {
							if (ladders > 0) {
									ladderUsage.offer(diff);
									ladders--;
							} else if (!ladderUsage.isEmpty() && diff > ladderUsage.peek()) {
									bricks -= ladderUsage.poll();
									ladderUsage.offer(diff);
							} else {
									bricks -= diff;
							}
							if (bricks < 0) {
									return false;
							}
					}
			}
			
			return true;
	}
}