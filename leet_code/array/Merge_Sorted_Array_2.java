class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = m - 1;//x�� �ε��� �迭 ����
        int y = n - 1;//y�� �ε��� �迭 ����
        int z = m + n - 1;//�ΰ��� �����͸� ���� ���� z �� �迭 ����
        while(y >= 0) {//while�� y��0���� ũ�ų� ����
        	if(x >= 0 && nums1[x] >= nums2[y]) {//x�� �迭�� �� Ŭ���
        		nums1[z--] = nums1[x--];//z�迭 ����ְ� �迭�� �ϳ� �ٿ��ش�
        	}
        	else {nums1[z--] = nums2[y--];//y�� �� Ŭ���� y�� ����ְ� �迭�� �ٿ��ش�
        	}
        }
    }
}

// �����ڷ� https://leetcode.com/problems/merge-sorted-array/discuss/1189409/My-Java-Solution
// ����� Ǯ�� ���� https://sanghoo.tistory.com/24?category=1035633
// ���ڵ� ���� https://leetcode.com/problems/merge-sorted-array/submissions/