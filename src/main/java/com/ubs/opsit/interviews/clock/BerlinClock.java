package com.ubs.opsit.interviews.clock;

import com.ubs.opsit.interviews.TimeConverter;
import com.ubs.opsit.interviews.constants.ClockConstants;
import com.ubs.opsit.interviews.validator.TimeValidator;

import java.util.stream.Stream;

public class BerlinClock implements TimeConverter {

    @Override
    public String convertTime(final String aTime) {

        //check whether the input is valid or not
        if(!TimeValidator.validateInputTime(aTime))
            return ClockConstants.INVALID_TIME;

        final int[] time = Stream.of(aTime.split(":")).mapToInt(Integer::parseInt).toArray();

        return  Seconds.getSeconds(time[2]) +
                Hours.getLampsLitForHours(time[0]) +
                Minutes.getLampsLitForMinutes(time[1]);
    }
}


