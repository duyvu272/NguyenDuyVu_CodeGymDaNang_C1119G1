package commons;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class BirthdayException extends Exception {
    public BirthdayException(String message) {
        super(message);
    }

    public static void checkBirthday(String date) throws BirthdayException {
        Date dayOfBirth = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            dayOfBirth = dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        final String regex = "^(0?[1-9]|[12][0-9]|3[01])[\\/-](0?[1-9]|1[012])[\\/-]\\d{4}$";
        Date date1 = new Date();
        LocalDate localDate1 = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate localDate = dayOfBirth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year = localDate.getYear();
        Period p = Period.between(localDate, localDate1);
        if (!date.matches(regex) || year < 1900 ||p.getYears()<18) {
            throw new BirthdayException(date + " invalid,format day(dd/mm/YYYY). Year must be >1900 and less current year 18 ");
        } else
            System.out.println("Success");
    }
}
