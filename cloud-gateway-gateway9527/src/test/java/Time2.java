import java.time.ZonedDateTime;

/**
 * @author wwh
 * @date 2020/10/13 14:32
 */
public class Time2 {
    public static void main(String[] args) {
        //默认时区
        ZonedDateTime zt = ZonedDateTime.now();
        System.out.println(zt);
        //固定时区
//        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
    }
}
