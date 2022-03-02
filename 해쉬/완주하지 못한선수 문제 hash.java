import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();//�ؽø��� ����
        
        for(String pl : participant)//key���� value�� �ҷ��ɴϴ� �̶� �������������� ����Ʈ���� ����ϴ�
        	map.put(pl,map.getOrDefault(pl, 0)+1 );//��� �����ڵ鿡�� 1�� �÷����ؼ� 1�������� ���ְ� ���������� ��� 2���˴ϴ�
        for(String pl : completion)//���⼭ �������� ���� ����� 1�� ������ ������
        	map.put(pl, map.get(pl)-1);//participant�� �����ϴ� �۾��� ���ݴϴ�
        
        for(String key : map.keySet()) {//key set���� ����� �����ڵ��� �ҷ����ݴϴ�
        	if(map.get(key)!=0) {//������ �������� ���ѻ���� 1�ǰ��� �����Ե˴ϴ�
        		answer = key;
        		break;
        	}
        }
        return answer;
    }
}

//���� �ڷ�:https://www.youtube.com/watch?v=_2yD46UxSso&t=951s
//���� �ڷ�:https://programmers.co.kr/learn/courses/30/lessons/42576?language=java