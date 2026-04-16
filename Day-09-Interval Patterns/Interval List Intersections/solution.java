class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> ans=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<firstList.length && j<secondList.length){
            int s1=firstList[i][0];
            int e1=firstList[i][1];
            int s2=secondList[j][0];
            int e2=secondList[j][1];
            // find intersection
            int s=Math.max(s1,s2);
            int e=Math.min(e1,e2);
            // Find valid intersection or not
            if(s<=e){
                ans.add(new int[]{s,e});
            }
            // Move pointer
            if(e1<e2) i++;
            else j++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
