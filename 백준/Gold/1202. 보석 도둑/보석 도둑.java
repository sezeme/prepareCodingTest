import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    // 가방 하나당 한 개의 보석만 넣을 수 있음.
    //  해당 가방에 들어갈 수 있는 가장 무거운 것 중 가격이 제일 비싼 것
    public static class Jewelry implements Comparable<Jewelry> {
        int m; // 무게
        int v; // 가격

        public Jewelry(int m, int v) {
            this.m = m;
            this.v = v;
        }

        @Override
        public int compareTo(Jewelry o) {
            // 정렬 : 가방도 제일 작게 들어가는 것부터 정렬, 보석도 제일 비싼 것부터 정렬
            if (m == o.m) return o.v - v;
            return m - o.m;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Jewelry[] jewelries = new Jewelry[n];
        for(int i = 0; i < n ; i++){
            st = new StringTokenizer(br.readLine());
            jewelries[i] = new Jewelry(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        int[] bags = new int[k];
        for(int i = 0; i < k ; i++){
            bags[i] = Integer.parseInt(br.readLine());
        }
        // 가방 - 무게 적은 것 부터
        // 보석 - 무게 적은 것 부터
        Arrays.sort(jewelries);
        Arrays.sort(bags);

        /*
        * 가방은 무게 적은 것 부터
        * 가방에 들어갈 보석은 무게가 가장 많으면서 가장 비싼 것(가장 작은 가방 기준)
        *
        * 가방 한 개가 무게순으로 담을 수 있는 모든 값(보석가치)를 담기. 그 중 가장 큰 값을 꺼내면 됨.
        * */

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        long totalValue = 0;
        int jewIdx = 0;
        for(int i = 0; i < k; i++){
            while(jewIdx<n && bags[i] >= jewelries[jewIdx].m){
                pq.offer(jewelries[jewIdx].v);
                jewIdx++;
            }
            if(!pq.isEmpty()) totalValue += pq.poll();
        }

        System.out.println(totalValue);
    }
}