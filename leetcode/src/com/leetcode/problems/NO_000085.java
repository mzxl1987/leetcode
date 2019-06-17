class Solution {
     /**
      * 使用图进行求解,每一层看成一个图,并没对每一层进行求面积
      */
     public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) return 0;
        int m = matrix.length, n = matrix[0].length, maxArea = 0;
        
        int[] left = new int[n];
        int[] right = new int[n];
        int[] height = new int[n];
        
        Arrays.fill(right, n - 1);                  //填充右侧边界
        
        for (int i = 0; i < m; i++) {
            //查找右侧边界
            int rB = n - 1;
            for (int j = n - 1; j >= 0; j--) {       //从右侧开始查找边界
                if (matrix[i][j] == '1') {
                    right[j] = Math.min(right[j], rB);  //查找最小的边界
                } else {                             //当 值为 0的时候
                    right[j] = n - 1;                //边界值设置为最大,无效边界,
                    rB = j - 1;                      //下标向左移动
                }
            }
            
            //查找左边界
            int lB = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1') {             //从左侧开始查找
                    left[j] = Math.max(left[j], lB);   
                    height[j]++;
                    maxArea = Math.max(maxArea, height[j] * (right[j] - left[j] + 1));    //计算最大面积
                } else {                            //值为0的时候
                    height[j] = 0;                  //高度归0
                    left[j] = 0;                    //下标标记为最左侧,即无效
                    lB = j + 1;                     //向右移动
                }
            }
        }
        return maxArea;
    }
}
