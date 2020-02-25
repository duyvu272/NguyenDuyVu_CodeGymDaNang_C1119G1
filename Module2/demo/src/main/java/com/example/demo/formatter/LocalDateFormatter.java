package com.example.demo.formatter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class LocalDateFormatter implements Formatter<LocalDate> {

    private DateTimeFormatter timeFormatter;
    private String datePatter;

    public LocalDateFormatter() {
    }

    public LocalDateFormatter(String datePatter) {
        this.datePatter = datePatter;
        timeFormatter = DateTimeFormatter.ofPattern(datePatter);
    }

    @Override
    public LocalDate parse(String text, Locale locale) throws ParseException {
       try{
           return LocalDate.parse(text,DateTimeFormatter.ofPattern(datePatter));

       }catch (DateTimeParseException e){
           throw new IllegalArgumentException("invalid date format. Please use this pattern\""
                   + datePatter + "\"");
       }
    }

    @Override
    public String print(LocalDate object, Locale locale) {
        return object.format(timeFormatter);
    }
}
