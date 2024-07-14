package Day1;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int aux[]=new int[nums.length];
        int idx=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]!=0){
                aux[idx++]=nums[i++];
            }else{
                i++;
            }
        }
        for(i=0;i<nums.length;i++){
            nums[i]=aux[i];
        }
        
    }
}