import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> h = new HashMap<>();//HashMap�� ����
        for(int i = 0; i<phone_book.length; i++) {//phone_book�� ���̸�ŭ �ݺ�
        	h.put(phone_book[i], 1);//Phone_book�� �ؽ��ʿ� �־��ָ鼭 value�� 1�� ����
        }
    	
        for(int i=0; i<phone_book.length; i++) {//�ε����� 0���� �ݺ�
        	for(int j=1; j<phone_book[i].length(); j++)//j��°�� 1���� �ݺ� ����
        		if(h.containsKey(phone_book[i].substring(0, j)))//i��° �ε����� 0���� j���� �����ؼ� ���ԵǾ��ִ��� Ȯ��
        			return false;//���ξ �����ϸ� return false �������������� return true���ȴ�
        }
        
        return true;
    }
}

//�����ڷ� https://coding-grandpa.tistory.com/77
//���� https://programmers.co.kr/learn/courses/30/lessons/42577?language=java