package Day1;

import java.util.HashMap;
public class TwoSum {


    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            int diff=target-nums[i];
            if(hm.containsKey(diff)){
                return new int[]{hm.get(diff),i};
            }
            hm.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}