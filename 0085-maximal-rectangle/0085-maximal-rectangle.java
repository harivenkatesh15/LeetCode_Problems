class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix==null||matrix.length==0)return 0;
        int rows=matrix.length,cols=matrix[0].length;
        int[] heights=new int[cols];
        int maxArea=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]=='1')heights[j]++;
                else heights[j]=0;
            }
            maxArea=Math.max(maxArea,largestRectangleArea(heights));
        }
        return maxArea;
    }
    private int largestRectangleArea(int[] heights){
        java.util.Stack<Integer> stack=new java.util.Stack<>();
        int maxArea=0,n=heights.length;
        for(int i=0;i<=n;i++){
            int curr=(i==n)?0:heights[i];
            while(!stack.isEmpty()&&curr<heights[stack.peek()]){
                int h=heights[stack.pop()];
                int w=stack.isEmpty()?i:i-stack.peek()-1;
                maxArea=Math.max(maxArea,h*w);
            }
            stack.push(i);
        }
        return maxArea;
    }
}
