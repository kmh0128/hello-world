import java.util.*;

class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i<nums.length; i++){
            nums[i] = (int) Math.pow(nums[i], 2);//������ 2���ش�
        }
        Arrays.sort(nums);//�������� �������ش�
        
        return nums;
    }
}

//������ ���� �ڷ� https://codechacha.com/ko/java-math-pow/

//���ڵ� ���� https://leetcode.com/problems/squares-of-a-sorted-array/