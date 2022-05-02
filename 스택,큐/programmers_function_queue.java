import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
    	Queue<Integer> q = new LinkedList<>();//������� �����ϱ����� ť���ۼ�
        ArrayList<Integer> result = new ArrayList<>();//������� ������� ����Ʈ ����
        for (int i = 0; i < progresses.length; i++) {//�ݺ��� ����
            int day = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);//�۾��� �ʿ��� ��¥�� �۾����� ���
            q.offer(day);//�տ������� ť�� �־��ش�
        }
        int prev = q.poll();//�Ǿ��� ť�� �����ְ� ����
        int cnt = 1;//�ʱⰪ 1�� ���� �۾� 1�����ϱ� ī��Ʈ�� 1
        while (!q.isEmpty()) {//ť�� �����ʴ��� ��� �ݺ�
            int next = q.poll();//�� �տ� ť�� �������� ����
            if (prev >= next) {//�Ǿ��� ���� ũ�ų� ������
                cnt++;//ī��Ʈ���ش�
            } else {
                result.add(cnt);//������� ī��Ʈ�� �ð��� �����ְ�
                cnt = 1;//�ʱⰪ�� 1�� �ٽ� ����
                prev = next;//�̰��� ������ �������� ������
            }
        }
        result.add(cnt);//��� ����Ʈ�� ī��Ʈ�� ���� �־��ְ�

        int[] answer = new int[result.size()];//�������ŭ answer�迭 ����
        for (int i = 0; i < answer.length; i++) {//���̸�ŭ �ݺ��� ����
            answer[i] = result.get(i);//�迭�� ������� �����´�
        }

        return answer;
    }
}

//�����ڷ� https://asong-study-record.tistory.com/82
//���α׷��ӽ� ���� https://programmers.co.kr/learn/courses/30/lessons/42586?language=java