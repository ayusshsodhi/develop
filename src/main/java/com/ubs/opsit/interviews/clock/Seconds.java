package com.ubs.opsit.interviews.clock;

import com.ubs.opsit.interviews.constants.ClockConstants;

interface Seconds {
    static String getSeconds(final int number) {
        if (number % 2 == 0)
            return String.valueOf(ClockConstants.YELLOW_LIGHT).concat(ClockConstants.END_OF_LINE);

        return String.valueOf(ClockConstants.OFF_LIGHT).concat(ClockConstants.END_OF_LINE);
    }

}
