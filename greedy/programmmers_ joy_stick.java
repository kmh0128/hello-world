class Solution {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();
        
        int move =len - 1;//���ĺ��� ��ü �̵��ϴ� �Ÿ� A�� 0���ε������� �����ϴϱ� -1�� ���ش�.
        for(int i = 0; i<len; i++) {
        	if(name.charAt(i) > 'N') {
        		answer += 'Z' - name.charAt(i) + 1; // Z�� ���� ���ĺ� ������ 26���� ���� ������ �Ѵ�
        	}
        	else {
        		answer += name.charAt(i) - 'A'; //A�� 1�γ��� ����ϸ� N��°������ ���
        	}
        	int conA = i+1;//���� �ε����� �ߺ��� ���ĺ��� ������ �ǵ��ư��°� ������ Ȯ���Ѵ�
        	while(conA < len && name.charAt(conA) =='A') {//�ߺ��� A�� ������ ������ �ݺ����ְ�
        		conA++;//A�� �߰�
        	}
        	move = Math.min(move, i+len-conA+i);//A�� �ϳ��� �����ؼ� ��ü �ε����� ������ ������ �������ȴ�
        }
        answer+=move;//��ü ������ ������ �����ְ� �������ش�
        
        return answer;
    }
}

//�����ڷ� https://excited-hyun.tistory.com/207