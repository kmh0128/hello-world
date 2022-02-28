import java.util*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
    	Queue<Integer> queue = new LinkedList<>();
    	int answer = 0; //������ ��
    	int time = 0; //�ð�
    	
    	for(int i = 0; i<truck_weights.length; i++) {
    		int truck = truck_weights[i];
    		
    		while(true) {
    			if(queue.isEmpty()) {//�ٸ��� ����ִ°�츦 ����
    				queue.add();
    				answer+=truck;
    				time++;
    				break;
    			}else if(queue.size()==bridge_length) {//�ٸ��� ���̰� �������
    				answer-=queue.poll();
    			}else {//�ٸ��� ���԰� �����ִ� ���
    				if(answer + truck <= weight) {
    					queue.add(truck);
    					answer+=truck;
    					time++;
    					break;
    				}else {//�ʰ����� ���
    					queue.add(0);
    					time++;
    				}	
    			}
    		}
    	}
    	
    	return time + bridge_length;//������ Ʈ���� �ö�͵� �ǳʰ��� �ð��� ����
    }
}
//�����ڷ�:https://minhamina.tistory.com/241
//���� :https://programmers.co.kr/learn/courses/30/lessons/42583?language=java