class Solution {
    public int solution(int a, int b, int c) {
        int []arr = new int[3];
        if(a == b) {
            arr[0]++;
            arr[1]++;
        }
        if(a == c) {
            arr[0]++;
            arr[2]++;
        }
        if(b == c) {
            arr[1]++;
            arr[2]++;
        }
        
        int []arrCount = new int[3];
        arrCount[arr[0]]++;
        arrCount[arr[1]]++;
        arrCount[arr[2]]++;
        
        if(arrCount[2] == 3){
            return (a + b + c) * (a*a*a + b*b*b + c*c*c ) * (a*a + b*b + c*c );
        } else if(arrCount[1] == 2 && arrCount[0] == 1){
            return (a + b + c) * (a*a + b*b + c*c );
        } else if(arrCount[0] == 3) {
            return a + b + c;
        }
        return 0;
    }
}