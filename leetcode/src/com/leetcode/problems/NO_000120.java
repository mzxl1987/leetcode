/**
给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。

例如，给定三角形：

[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。

说明：

如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。

**/
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        for(int i=triangle.size()-2;i>=0;i--){
            List<Integer> t = triangle.get(i);
            for(int j=0;j<=i;j++){
                //得到这一行与下一行相邻数的和的最小值
                int res = t.get(j) + Math.min(triangle.get(i+1).get(j),   triangle.get(i+1).get(j+1));    
                t.set(j,res);         //更新第（i+1）行第（j+1）个数字
            }
        }
        return triangle.get(0).get(0);  //返回第一行第一个数字，也就是最小值
    }
}
