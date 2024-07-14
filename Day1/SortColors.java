package Day1;

public class SortColors {
    public void merge(int nums[],int l,int mid,int r){
        int left=l;
        int right=mid+1;
        int idx=0;
        int aux[]=new int[r-l+1];
        while(left<=mid && right<=r){
            if(nums[left]<=nums[right]){
                aux[idx++]=nums[left++];

            }else{
                aux[idx++]=nums[right++];
            }

        }
        while(left<=mid){
            aux[idx++]=nums[left++];

        }
        while(right<=r){
            aux[idx++]=nums[right++];
        }
         for(int i=l;i<=r;i++){
            nums[i]=aux[i-l];
        }

    }
    public void mergeSort(int nums[],int l,int r){
        if(l>=r) return;
        int mid=l+(r-l)/2;
        mergeSort(nums,l,mid);
        mergeSort(nums,mid+1,r);
        merge(nums,l,mid,r);
    }
    public void sortColors(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        
    }
}