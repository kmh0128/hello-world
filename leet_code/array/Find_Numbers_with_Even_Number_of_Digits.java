class Solution {
    public int findNumbers(int[] nums) {
    	int dight = 0;
    	
    	for(int n : nums) {
    		if(Integer.toString(n).length % 2== 0){//�������� ���������� �ٲ㼭 ��ü���̰� 2�� ������ ��������
    			dight++;//¦���̹Ƿ� ī��Ʈ
    		}
    	}
    	return dight;
    }
}

//���ڵ� ���� https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/

//���� https://jungkeung.tistory.com/112

//ó���� ȥ�� Ǯ���Ҷ� ���� ��ü�� ���̸� ¦���� �ƴ� �־��� ���ȿ� ¦���� �ִ°ɷ� �߸� ������
