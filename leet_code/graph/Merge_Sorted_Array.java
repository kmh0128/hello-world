class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        for(int i = m; i<nums1.length; i++){//nums1 ���̸�ŭ �ݺ� ����
            nums1[i] = nums2[i - m];//nums1�� ��� m�ǵڿ� nums2�ǻ������ ����ش�
        }
        Arrays.sort(nums1);//�������� ����
    }
}


//���ڵ� ���� https://leetcode.com/problemset/all/?difficulty=EASY&page=1&topicSlugs=graph