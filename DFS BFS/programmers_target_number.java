class Solution {
	int answer;
    public int solution(int[] numbers, int target) {
        answer = 0;
        dfs(0, 0, numbers, target);//dfs�Լ��� ����Լ��� ȣ�� ���ش� 
        return answer;
    }
    void dfs(int n, int sum, int[] numbers, int target) {
    	if(n == numbers.length) {//numbers ���̸�ŭ int n�� �ݺ� n�� �ε��������̰�
    		if(sum == target)//int sum�� Ÿ�ٳѹ��� ������������ �ݺ�
    			answer++;//ī��Ʈ ���ְ�
    		return;//����
    	}
    	
    	dfs(n + 1, sum + numbers[n], numbers, target);//�ε����� ��� �ڷ� �����ϸ鼭 �����ִ� �����ΰ��� -���Ǵ� ��쵵 �����ϱ� �ΰ����� �߰�
    	dfs(n + 1, sum - numbers[n], numbers, target);
    }
}

//�����ڷ� https://coding-grandpa.tistory.com/108
//���α׷��ӽ� ���� https://programmers.co.kr/learn/courses/30/lessons/43165?language=java