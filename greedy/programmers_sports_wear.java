import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        HashSet<Integer> rs = new HashSet<>();//reserve�� HashSet�� ����
        HashSet<Integer> ls = new HashSet<>();//lostfh HashSet�� ���� 
        
        for(int i : reserve) 
        	rs.add(i);//ü������ �Ҿ���������� ����� rs �ؽ��¿� �߰�
        for(int i : lost) {
        	if(rs.contains(i)) //ü������ �Ҿ� ���� ����� ls�ؽ��¿� �߰� 
        		rs.remove(i);//�̶� ���� ü������ ��������� �Ҿ�������� rs �ؽ��¿��� ����
        	else
        		ls.add(i)//�׸��� ls�� �߰����ش�
        }
        for(int i : reserve) {
        	if(ls.contains(i-1))//������ ������ �ִ� ����� �տ� ����� ü���� ������ Ȯ��
        		ls.remove(i-1);//���������� ü������ �������� ���̽����� ����
        	else if(ls.contains(i+1))//������ �������ִ� ����� �ڿ��ִ��� Ȯ�� �տ� ������
        		ls.remove(i+1);//�����ְ� ����
        }
        return n - ls.size();//��ü�л����� �Ҿ���� ������� ���ش� �ݺ����ְ� ����
    }
}

//���α׷��ӽ� �ּ� https://programmers.co.kr/learn/courses/30/lessons/42862?language=java
//�����ڷ� https://coding-grandpa.tistory.com/99