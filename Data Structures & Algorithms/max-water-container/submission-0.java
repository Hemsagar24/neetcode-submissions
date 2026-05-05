class Solution {
    public int maxArea(int[] heights) {

        int left = 0;
        int right = heights.length -1;
        int areaFinal = 0;

        for(int i = 0; i< heights.length -1; i++){

            int area = (right - left) * Math.min(heights[right], heights[left]);
            areaFinal = Math.max(areaFinal, area);

            if(heights[right] > heights[left]){
                left++;
            }else{
                right--;
            }

        }

        return areaFinal;
        
    }
}
