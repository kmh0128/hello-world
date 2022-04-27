import java.util.*;



public class Main {
	static int node[][]; // ������� �迭
	static int visit[]; // ����� �湮���� ǥ�� �迭
	static Queue<Integer> queue = new LinkedList<>(); // BFS�� ���� ť
	static void dfs(int x) { // DFS �޼ҵ� ���ȣ�� �ݺ��Ѵ�.
		if(visit[x] == 1) return; //�̹� �湮�� ����� �����Ѵ�.
		
		visit[x] = 1; //�湮���� ���� ����� �湮���θ� ǥ���ϰ� ����Ѵ�.
		System.out.print(x+" ");
		for(int i =1;i<node.length;i++) { // ��������� ��� �࿭�� �밢���� �������� ��Ī�� �ǹǷ� �� �Ǵ� ���� �������θ� Ž���ϸ�ȴ�.			
			if(node[x][i]==1) { // �湮���� ���� ����� ���� ����� ���
				
				dfs(i); // �ش� ���� �̵�
			}
		}
	}
	
	static void bfs(int x) { //BFS �޼ҵ� ť�� �̿��� ����
		      
		queue.offer(x); // ť�� ���� ��� ����
		visit[x] = 1; // ���� ��带 �湮 ǥ��
		while(!queue.isEmpty()) { // ����ť�� �� ������ �ݺ�
			x = queue.poll(); // ť���� �ϳ� ������.
			System.out.print(x+" "); // ���
			for(int i =1;i<node.length;i++) { // ť���� ���� ���� ����� ��带 Ž��			
				if(visit[i]!=1 && node[x][i]==1 ) {	// ť���� ���� ���� ����� ��尡 �湮���� �ʾҴ� �����
					queue.offer(i); // ť�� ���� ��
					visit[i] =1; // �湮 ǥ��
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int n= sc.nextInt(); // ������ ����
		int m = sc.nextInt(); // ������ ���� 
		int v = sc.nextInt(); // Ž�� ���� ���
		
		node = new int[n+1][n+1];
		visit = new int[n+1];
		
		for(int i=0; i<m;i++) { // ������ķ� �׷����� ����
			
			int a =sc.nextInt();
			int b = sc.nextInt();
			node[a][b] =1;
			node[b][a]= 1;
		}
		
		
		
		dfs(v);
		Arrays.fill(visit, 0); // DFS���� ������ �湮 ���ι迭�� ����ϱ� ������ �ٽ� 0���� �ʱ�ȭ ���ش�.
		System.out.println("");
		bfs(v);
		
	}
	
}
//�����ڷ� https://fbtmdwhd33.tistory.com/27
//���� 1260���� https://www.acmicpc.net/problem/1260