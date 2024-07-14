package Day1;

import java.util.*;
public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                ans.add(nums[i]);
            }else{
                hs.add(nums[i]);
            }
        }
        return ans;
    }
}
