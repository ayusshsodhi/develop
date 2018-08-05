package com.ubs.opsit.interviews.clock;

import com.ubs.opsit.interviews.constants.ClockConstants;
import com.ubs.opsit.interviews.rule.LampsRule;
import com.ubs.opsit.interviews.util.Utility;

interface Minutes {

    static String getLampsLitForMinutes(final int minutes) {
        return getLampsForFirstMinutesRow(minutes).concat(ClockConstants.END_OF_LINE).concat(getLampsForSecondMinutesRow(minutes));
    }

    //with java 9, we could have had this method as private
    static String getLampsForFirstMinutesRow(final int minutes) {
        return LampsRule.getLampsLit(11, Utility.getOnLampsForFirstRows(minutes), String.valueOf(ClockConstants.YELLOW_LIGHT));
    }

    //with java 9, we could have had this method as private
    static String getLampsForSecondMinutesRow(final int minutes) {
        return LampsRule.getLampsLit(4, minutes% ClockConstants.FIVE, String.valueOf(ClockConstants.YELLOW_LIGHT));
    }
}
