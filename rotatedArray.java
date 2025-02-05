package Default;
//Time Complexity : log n
//Space Complexity :
//Did this code successfully run on Leetcode : yes
//Any problem you faced while coding this : yes, referred to class video for clear confusion regarding algorithm after attempting the question multiple times

public class rotatedArray {
	
	   public int search(int[] nums, int target) {
	        
	        
	        int low = 0;
	        int high = nums.length - 1;
	        
	        while(low <= high){
	            
	            int mid = low + (high - low) / 2;
	            
	            if(nums[mid] == target){
	                
	                return mid;
	            }
	            //check if left side is sorted
	            else if(nums[low] <= nums[mid]){
	                
	                if(nums[low] <= target && nums[mid] > target){
	                    
	                    high = mid -1;
	                }
	                
	                else low = mid + 1;
	            }
	            //check if right side is sorted as left side isn't
	           else {
	               
	               if(nums[mid] < target && nums[high] >= target){
	                    
	                    low = mid + 1;
	                }
	                
	                else high = mid - 1;
	            }
	           }
	                
	            
	            return -1;
	      
	    }

}
