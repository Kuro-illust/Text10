import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalTime;

public class Test{
    public static void main(String[] args){
        TestTime testtime = () -> {
            LocalTime localTime = LocalTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
            String s = localTime.format(formatter);
            System.out.println("------------------------------------\nTIME : " + s +"\n------------------------------------"); 
        };
      
        testtime.gettime();
    }   
}