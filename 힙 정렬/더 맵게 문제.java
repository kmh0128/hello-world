import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> squeue = new PriorityQueue<>();
        for(int i = 0; i<scoville.length; i++)//ť�� ����� ���ں� ��ü�� ����
        	squeue.offer(scoville[i]);//ť�� ���ں��� �����ش�
        
        while(squeue.peek()<K) {
        	if(squeue.size()==1) {//�̺κ��� ó���� 2��� �߸� �����ϰ� �����ڷḦ ����  ����
        		return -1;
        	}
        		int first = squeue.poll();//�Ǿ��ǰ� �������� ����
        		int second = squeue.poll();//�ι�°�������� �������� ����?
        		
        		squeue.offer(first + second*2);//����� ť�� ���ο� �ڸ��� �߰� 
        		answer++;//�߰�
        		}
        
        return answer;
    }
}

//�����ڷ�: https://dunchi.tistory.com/83
//���α׷��ӽ� ����:https://programmers.co.kr/learn/courses/30/lessons/42626?language=java