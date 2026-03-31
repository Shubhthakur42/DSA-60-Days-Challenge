class Solution {
    public boolean isValid(int[] nums,int k,int mid){
        int n=nums.length;
        int sum=0;
        int count=1;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>mid){
                sum=nums[i];
                count++;
            }
        }
        if(count<=k) return true;
        return false;
    }
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int low=nums[0];
        int high=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]>low) low=nums[i];
            high+=nums[i];
        }
        int ans=high;
        while(high>=low){
            int mid=low+(high-low)/2;
            boolean res=isValid(nums,k,mid);
            if(res){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}
