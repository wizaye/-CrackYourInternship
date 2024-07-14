package Day1;

import java.util.HashSet;
public class FindTheDuplicateNumber {
    public int findDuplicate(int[] nums) {
       HashSet<Integer> hs=new HashSet<>();
       for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                return nums[i];
            }
            hs.add(nums[i]);
       }
       return -1;
        
    }
}