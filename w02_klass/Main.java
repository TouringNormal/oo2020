import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import sun.util.calendar.LocalGregorianCalendar.Date;


public class Main {

    public static void main(String[] args) {
        PersonalCode raimoCode = new PersonalCode();
        raimoCode.setCode("45005050505");
        System.out.println(raimoCode.getCode());
        System.out.println(raimoCode.gender());

        System.out.println(raimoCode);

        Date date = new Date();

        System.out.println(date.toString);
    }

}