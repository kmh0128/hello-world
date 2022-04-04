import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;//���� �������� ����� �����ش�
        
        Arrays.sort(reserve);//������ ������ �ִ� ����� �������� �迭
        Arrays.sort(lost);//�Ҿ��������� �������� �迭
        
        for(int i = 0; i<lost.length; i++;) {//�Ҿ���� �����ŭ ���̸� �ݺ�
        	for(int j = 0; j<reserve.length; j++;) {//������ �������ִ»����ŭ �ݺ�
        		if(reserve[j]=lost[i]) {//������ ������ �ִ� ����� ���ϸ��� ���
        			answer++;
            		reserve[j] = -1;//�Ѵ� -1�� �������༭ ������ ������ �ִ»���� �Ҿ���� ������� �����ش�
            		lost[i] = -1;
            		break;
        		}
        	}
        }
        
        for(int i = 0; i<lost.length; i++;) {
        	for(int j = 0; j<reserve.length; j++;) {
        		if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){//������ ������ �ִ»���� ���ϸ��� �ʾҴٸ� �յ� ����� �Ҿ���ȴ��� Ȯ��
                    answer++;
                    reserve[j] = -1; //�ϵ� ������� �����־����Ƿ� -1�� ����
                    break; 
                }
        	}
        }
        return answer;
    }
}
//���� �ڷ� https://jeleedev.tistory.com/32