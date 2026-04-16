class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<List<Integer>> ins=new ArrayList<>();
        int n=intervals.length;
        int s=newInterval[0];
        int e=newInterval[1];
        boolean flag=true;
        for(int i=0;i<n;i++){
            int s1=intervals[i][0];
            int e1=intervals[i][1];
            if(s<=s1 && flag==true){
                ins.add(Arrays.asList(s,e));
                flag=false;
            }
            ins.add(Arrays.asList(s1,e1));
        }
        if(flag) ins.add(Arrays.asList(s,e));// suppose no element smaller than s
        List<int[]> ans=new ArrayList<>();
        int start1=ins.get(0).get(0);
        int end1=ins.get(0).get(1);
        int m=ins.size();
        for(int i=1;i<m;i++){
            int start2=ins.get(i).get(0);
            int end2=ins.get(i).get(1);
            if(end1>=start2){
                end1=Math.max(end1,end2);
            }
            else{
                ans.add(new int[]{start1,end1});
                start1=start2;
                end1=end2;
            }
        }
        ans.add(new int[]{start1,end1});
        return ans.toArray(new int[ans.size()][]);
    }
}
