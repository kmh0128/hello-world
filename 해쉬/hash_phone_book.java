import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book);//��ȭ��ȣ�θ� ������������ �������ش�.
        
        for(int i =0; i<phone_book.length-1; i++)//��ȭ��ȣ�� i��°���� �ڿ� ��ȭ��ȣ�ζ� ���ؾߵǼ� -1�� ���ݴϴ�.�����ڷẸ������ -1�� �������ؼ� �����߻�
        	if(phone_book[i+1].startsWith(phone_book[i]))//�޹�ȣ�� �չ�ȣ�� ���� ���� ��ȣ�� �����ϴ��� �˻�
        		return false;//�ڵ尡 ������������ ���ξ ���ٴ¶��̱� ������ retrun true�� ���ݴϴ�.
        
        return answer;
    }
}
//�����ڷ� https://coding-grandpa.tistory.com/77
//���� �ּ� https://programmers.co.kr/learn/courses/30/lessons/42577?language=java