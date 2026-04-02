class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int max=0;
        int i=0;
        int j=n-1;
        while(i<=j){
            int width=j-i;
            int length=Math.min(height[i],height[j]);
            int area=length*width;
            max=Math.max(max,area);
            if(height[i]>height[j]) j--;
            else i++;
        }
        return max;
    }
}
