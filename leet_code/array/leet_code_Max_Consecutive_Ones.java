class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;//���ӵǴ� 1�� ī��Ʈ
        int max =0;//�ִ밪
        
        for(int n : nums) {
        	if(n==1) {
        		count ++;//�迭�� ���鼭 1�� ������ ī��Ʈ
        		if(max < count) =count;//������ 1�� ī��Ʈ�Ѱ� max�� ���Ŀ� ī��Ʈ�Ѱͺ��� ������ max =count���� ���ش�
        	}
        	else count = 0;//�ٸ���� 1�� 0�ۿ� �����ϱ� 0���� ī��Ʈ ���ش�
        }
        
        return max;//�ƽ��� ����
    }
}

//�����ڷ� �� ���� �ڷ� :https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/