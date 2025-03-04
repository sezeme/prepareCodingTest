class Solution {
  public int solution(int n) {
      int answer = 0;
      boolean[] check = new boolean[n+1];

      check[0] = check[1] = true;
      for(int i =2; i*i<n+1; i++){
          for(int j= i*i; j<n+1; j+=i)
              check[j] = true;
      }
      for(int i=2; i<n+1; i++){
          if(check[i] == false)
              answer++;
      }
      return answer;
  }
}