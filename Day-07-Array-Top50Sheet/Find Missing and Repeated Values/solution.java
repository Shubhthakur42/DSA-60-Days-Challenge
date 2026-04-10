class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int sum=0;
        int[] ans=new int[2];
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(!set.contains(grid[i][j])){
                    set.add(grid[i][j]);
                    sum+=grid[i][j];
                }
                else ans[0]=grid[i][j];
            }
        }
        int x=n*n;
        int total=(x*(x+1))/2;
        System.out.print(total + " "+ sum);
        ans[1]=total-sum;
        return ans;
    }
}
