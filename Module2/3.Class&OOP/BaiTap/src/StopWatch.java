import java.util.Date;

public class StopWatch {
    private long starTime;
    private long endTime;

//    String myDate = "2014/10/29 18:10:45";
//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//    Date date = sdf.parse(myDate);
//    long millis = date.getTime();
//


    public StopWatch(){
        this.starTime = System.currentTimeMillis();
    }
    public long star(){
        return this.starTime = System.currentTimeMillis();
    }
    public long stop(){
        return this.endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endTime - this.starTime;
    }
}
