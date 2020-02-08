public class ExcuteTimeStamp {
    public static void main(String[] args) {
        StopWatch s = new StopWatch();
        s.star();
        int count = 1;
        for(int i = 0;i<1000000;i++){
            count+=count + 10;
        }
        s.stop();
        System.out.println(s.getElapsedTime());
    }
}
