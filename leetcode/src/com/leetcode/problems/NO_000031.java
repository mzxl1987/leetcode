/**
实现获取下一个排列的函数，算法需要将给定数字序列重新排列成字典序中下一个更大的排列。
如果不存在下一个更大的排列，则将数字重新排列成最小的排列（即升序排列）。
必须原地修改，只允许使用额外常数空间。
以下是一些例子，输入位于左侧列，其相应输出位于右侧列。
1,2,3 → 1,3,2
3,2,1 → 1,2,3
1,1,5 → 1,5,1
**/
public class Solution {
    /**
     * 1.从右开始查找第一个不是递增序列的值
     * 2.如果没有查找到,反转数组;
     *   如果找到了i, 则从右开始查找第一个比i大的值m, i,m交换位置
     * 3.数组反转
     */
    public void nextPermutation(int[] A) {   // {2,3,6,5,4,1}
        if(A == null || A.length <= 1) return;
        int i = A.length - 2;
        while(i >= 0 && A[i] >= A[i + 1]) i--; // 查找第一个不是递增的值, {2,[3],6,5,4,1}
        if(i >= 0) {                           // 当i < 0,说明没有查找到该值
            int j = A.length - 1;              // 从右侧开始查找第一个比3大的值
            while(A[j] <= A[i]) j--;           // {2,3,6,5,[4],1}
            swap(A, i, j);                     // 交换3,4的位置
        }
        reverse(A, i + 1, A.length - 1);       // 将数组翻转
    }

    public void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    public void reverse(int[] A, int i, int j) {
        while(i < j) swap(A, i++, j--);
    }
}
