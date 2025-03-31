class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = String.valueOf(x);
        int arr[] = new int[str.length()];
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
            sum += arr[i];
        }

        answer = (x%sum==0)?true:false;
        return answer;
    }
}