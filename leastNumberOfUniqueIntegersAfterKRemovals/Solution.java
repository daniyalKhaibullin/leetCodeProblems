import java.util.*;


class Solution {
	public int findLeastNumOfUniqueInts(int[] arr, int k) {
			HashMap<Integer, Integer> nFrequencies = new HashMap<>(); 
			for(int num : arr) {
					nFrequencies.put(num, nFrequencies.getOrDefault(num, 0) + 1);
			}
			
			List<Integer> list = new ArrayList<>(nFrequencies.values());
			Collections.sort(list); 
			
			int answer = list.size(); 
			
			for(Integer freq : list) {
					if(k >= freq) {
							k -= freq;
							answer--; 
					} else {
							break;
					}
			}
			
			return answer;
	}
}