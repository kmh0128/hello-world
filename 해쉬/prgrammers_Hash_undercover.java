import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> Hm = new HashMap<>();//�ؽ����� ����
        
        for(int i = 0; i<clothes.length; i++) {
        	if(Hm.containsKey(clothes[i][1]))//�ؽ��ʿ� �ִ� �ʵ��� �ѹ��� �Ծ��������� 1�� ǥ��
        		Hm.replace(clothes[i][1], Hm.get(clothes[i][1])+1);//�ѹ� �� �Ծ������ +1
        	else
        		Hm.put(clothes[i][1], 1);	//�ѹ��� �Ծ������
        }
        
        int answer = 1;//�ƹ��͵� ���Ծ�����츦 �ʱⰪ 1�μ���
        for (int value : Hm.values()) {
            answer*=(value+1);//value ���� �ؽ����� �־��ָ鼭 �����ذ��� �����ش�
        }
        answer-=1;//�������� �ƹ��͵� ������ ����Ǽ��� ���ش�
        
        return answer; 
    }
}

//�����ڷ� https://developerdk.tistory.com/12

//���� https://programmers.co.kr/learn/courses/30/lessons/42578?language=java

