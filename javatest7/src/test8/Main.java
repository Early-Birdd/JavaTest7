package test8;

import java.util.*;
public class Main {
	
	int answer = 0;
	int[] dis = {1, -1, 5};
	int[] ch;
	
	public int BFS(int n, int m) {
		Queue<Integer> Q = new LinkedList<>();
		ch = new int[10001];
		ch[n] = 1;
		Q.offer(n);
		int L = 0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			for(int i=0; i<len; i++) {
				int x = Q.poll();
				if(x==m) {
					return L;
				}
				for(int j=0; j<3; j++) {
					int nx = x + dis[j];
					if(nx>=1 && nx<=10000 && ch[nx]==0) {
						ch[nx] = 1;
						Q.offer(nx);
					}
				}
			}
			L++;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		System.out.print(T.BFS(n,m));
	}

}
