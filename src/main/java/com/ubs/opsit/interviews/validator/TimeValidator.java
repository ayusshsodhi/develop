package com.ubs.opsit.interviews.validator;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class TimeValidator {

    public static boolean validateInputTime(final String time){
        if(time == null)
            return false;
        try {
            // if we don't want input of 24:00:00 as well, we can set the resolver style to ResolverStyle.STRICT
            DateTimeFormatter timeParseFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            LocalTime.parse(time, timeParseFormatter);
        }
        catch(DateTimeParseException e){
            return false;
        }
      return true;
    }


}
