package dates;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDate {
    public static void main(String args[]){
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        DateTimeFormatter fff = DateTimeFormatter.ofPattern("dd MMM, yyyy HH:mm:ss");
        System.out.println(fff.format(time));
    }
}
