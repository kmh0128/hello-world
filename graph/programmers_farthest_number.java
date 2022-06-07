import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        //ArrayList�� �׷����� ����
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i<edge.length; i++) {
        	graph.add(new ArrayList<Integer>());
        }
        
        int fi, se;//���� ��尣�� ����
        for(int[] node:edge) {
        	fi = node[0];
        	se = node[1];
        	graph.get(fi).add(se);
        	graph.get(se).add(fi);
        }
        
        int[] count = new int[n+1];//1���� �Ÿ�����
        boolean[] visited = new boolean[n + 1];//�游�� ���� 1���� �Ÿ�
        Queue<Integer> q = new LinkedList<>();//bfs 
        q.add(1);
        visited[0]=visited[1]=true;//0�� 1�� �湮 �ߴٴ� ǥ��
        int now;//���� 
        while(!q.isEmpty()){//bfs �ۼ�
        	now=q.poll();
        	for(int g : graph.get(now)) {
        		if(!visited[g]){
        			count[g]=count[now]+1;//1���� ���� ����
                    visited[g]=true;//�湮�ߴٸ�
                    q.add(g);//ť�� ����
        		}
        	}
        }
        
        int max = 0; //�ʱ� ��� 1�� ���� �ָ� ������ �� ����
        for( int cnt : count) {
        	if(max<cnt){
        		max=cnt;
        		answer = 1;
        	}
        	else if(max==cnt) answer++;
        }
        return answer;
    }
}

//���� �ڷ�:https://iamheesoo.github.io/blog/algo-prog49189

//���α׷��ӽ� ���� https://programmers.co.kr/learn/courses/30/lessons/49189?language=java