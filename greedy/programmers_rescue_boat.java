import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int min = 0;//�ּҰ��� ������ int�� ����
        Arrays.sort(people);//�������� ����
        
        for(int max = people.length-1; min <= max; max--) {
        	if(people[min] + people[max] > limit) {
        		answer++;//for �ݺ������� ���� ���ſ� ����� �ڿ� ���� �ε����� ���̴� 0���� �����̹Ƿ� -1�� ���ְ� �ּҰ� �ִ밪�� ��Ʈ���Ժ��� �������� ��Ʈ�� �߰�
        	}else {
        		answer++;//�ƴϸ� ���ÿ� �ּ��ο��� �¿��ְ� ��Ʈ�� ����
        		min++;
        	}
        }
        return answer;
    }
}

//���� �ڷ� https://conanglog.tistory.com/227
//���α׷��ӽ� ���� https://programmers.co.kr/learn/courses/30/lessons/42885?language=java