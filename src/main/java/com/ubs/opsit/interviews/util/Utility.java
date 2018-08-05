package com.ubs.opsit.interviews.util;

import com.ubs.opsit.interviews.constants.ClockConstants;

public interface Utility {
    //is used for the first rows of both hours and minutes
    static int getOnLampsForFirstRows(final int count) {
        return (count-(count% ClockConstants.FIVE))/ ClockConstants.FIVE;
    }
}
