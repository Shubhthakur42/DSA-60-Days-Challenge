class Solution {
    public boolean isValid(int[] bloomDay,int m,int k,int mid){
        int n=bloomDay.length;
        int bouquet=0;
        int flower=0;
        for(int i=0;i<n;i++){
            if(bloomDay[i]<=mid){
                flower++;
                if(flower==k){
                    bouquet++;
                    flower=0;
                }
            }
            if(bloomDay[i]>mid) flower=0;
        }
        if(bouquet>=m) return true;
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        int low=1;
        int high=bloomDay[0];
        for(int i=0;i<n;i++){
            if(bloomDay[i]>high) high=bloomDay[i];
        }
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            boolean res=isValid(bloomDay,m,k,mid);
            if(res){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}
