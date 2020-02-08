package views;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        Villa v = new Villa("Dich Vu 1",30.5,5000,7,"7 ngay","Vip","Buffer Free",3,30.5);
//        System.out.println(v.showInfor());
        Scanner s = new Scanner(System.in);
        int i;
//        final String regex = "(^[A-z]{1}[a-z]*)( [A-Z]{1}[a-z]*)*$";
//        final String string = "Nguyen";
//        final String subst = "";
//
//        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
//        final Matcher matcher = pattern.matcher(string);
//
//// The substituted value will be contained in the result variable
//        final String result = matcher.replaceAll(subst);
//        boolean test = string.matches(regex);
//        System.out.println("Substitution result: " + test);

        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
//        String day = "27-02-1991";
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
//        Date dayOfBirth = null;
//        try {
//            dayOfBirth = dateFormat.parse(day);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        LocalDate dat = dayOfBirth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//        Period a = Period.between(dat,localDate);
//
//        System.out.println(a.getYears());
//    }
        String name = "feMale";
        String convert = "";
        convert +=name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println(convert);
    }
}
