class Solution {
    public int heightChecker(int[] heights) {
        int expected[]= new int[heights.length];
        int count=0;
        for(int i=0; i<heights.length;i++){
            expected[i]= heights[i];
        }

        for(int i=0;i<expected.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<expected.length;j++){
                if(expected[minpos]>expected[j]){
                    minpos= j;
                }
            }
            int temp= expected[minpos];
            expected[minpos]= expected[i];
            expected[i]= temp;           
        }
        for(int i=0;i<expected.length;i++){
            
            if(heights[i]!=expected[i]){
                count++;
            }

        }
        return count;
        
    }
}