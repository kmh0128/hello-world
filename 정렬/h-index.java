import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);//������������ ����
        
        for(int i=0; i<citations.length; i++) {//citiation�� ���̸�ŭ �ݺ�
        	int h = citiations.length-i;//citation���� 5���� i��ŭ ���ش� ó���� i�� �������ʾ� Ʋ�ȴ� �����ڷẸ�� ����
        	
        	if(citiations[i]>=h){//���ǹ��� ���ǿ� �������� answer�� ���� ���ǿ� ���������� �극��ũ
        		answer=h;
        		break;
        	}
        }
        return answer;
    }
}
//�����ڷ� https://conanglog.tistory.com/221
//���α׷��ӽ� ���� https://programmers.co.kr/learn/courses/30/lessons/42747?language=java