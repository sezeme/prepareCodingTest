class Solution {
    static Time video;
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        video = new Time(video_len);
        
        return run(video_len, pos, op_start, op_end, commands);
    }
    
    public static String run(String video_len, String pos, String op_start, String op_end, String[] commands) {
        Time time = new Time(pos);
        
        Time opStart = new Time(op_start);
        Time opEnd = new Time(op_end);

        for(String command : commands){
            if(time.compareTo(opStart) >= 0 && time.compareTo(opEnd) <= 0){
                time.setTime(op_end);
            }
            time.calc(command);
        }
        if(time.compareTo(opStart) >= 0 && time.compareTo(opEnd) <= 0){
            time.setTime(op_end);
        }
        
        return time.getTime();
    }

    public static class Time implements Comparable {
        public int minute, second;
        Time(String str){
            String []list = str.split(":");
            minute = Integer.parseInt(list[0]);
            second = Integer.parseInt(list[1]);
        }

        void setTime(String str){
            String []list = str.split(":");
            minute = Integer.parseInt(list[0]);
            second = Integer.parseInt(list[1]);
        }

        String getTime(){
            String result = "";
            if(minute < 10) result += 0;
            result += minute + ":";

            if(second < 10) result += 0;
            result += second;

            return result;
        }

        void calc(String command){
            if(command.equals("next")){
                plus();
            } else if(command.equals("prev")){
                minus();
            }
        }

        private void plus() {
            int tmp = second + 10;
            second = tmp % 60;
            minute += tmp / 60;
            
            if(compare(video) < 10){
                minute = video.minute;
                second = video.second;
            }
        }

        private void minus() {
            int tmp = second - 10;
            second = tmp < 0 ? 60 + tmp : tmp;
            minute -= tmp < 0 ? 1 : 0;
            
            if(minute == 0 && second < 10){
                second = 0;
            }
            
            if(minute < 0){
                minute = 0;
                second = 0;
            }
        }
        
        public int compare(Time o){
            String str = o.getTime();
            
            return (o.minute - minute) * 60 + (o.second - second);
        }

        @Override
        public int compareTo(Object o) {
            if(minute == ((Time)o).minute){
                return second - ((Time)o).second;
            }
            return minute - ((Time)o).minute;
        }
    }
}