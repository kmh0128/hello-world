class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];//��� �� 2����?
        
        int area = brown + yellow;//��ü Ÿ���� ����
        
      //������� 3�̻��̿��� �մϴ�.
        //���� �ּ� ���̶� ���ƾ� �ȴ�
        for(int i =3; i<=area; i++) {
        	int col = i; //��
        	int row = area / col;//��
        	
        	if(row<3) {//���� ���� ���⿡�� 3�� �̸��ϰ��� ������
        		continue;
        	}
        	
        	if(row>=col) {//���� ������ ũ�ų� ����
        		
        		if((row -2 )*(col -2) == yellow) {//����� Ÿ���� ���� ���ϱ�
        			answer[0] = row;
                    answer[1] = col;
                    return answer;
        		}
        	}
        }
 
        return answer;
    }
}

//���� �ڷ� https://hak0205.tistory.com/145
// ���α׷��ӽ� ���� https://programmers.co.kr/learn/courses/30/lessons/42842?language=java