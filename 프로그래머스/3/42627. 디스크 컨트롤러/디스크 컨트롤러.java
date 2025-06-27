import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);

		PriorityQueue<int[]> priorQ = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

		int idx = 0;
		int cnt = 0;
		int sum = 0;
		int end = 0;
		while(cnt < jobs.length) {

			while(idx < jobs.length && jobs[idx][0] <= end) {
				priorQ.add(jobs[idx++]);
			}

			if(priorQ.isEmpty()) {
				end = jobs[idx][0];
			} else {
				int[] curJob = priorQ.poll();
				sum += curJob[1] + end - curJob[0];
				end += curJob[1];
				cnt++;
			}
		}
        
        answer = sum / jobs.length;
        return answer;
    }
}