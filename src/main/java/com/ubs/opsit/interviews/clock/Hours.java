package com.ubs.opsit.interviews.clock;

import com.ubs.opsit.interviews.constants.ClockConstants;
import com.ubs.opsit.interviews.rule.LampsRule;
import com.ubs.opsit.interviews.util.Utility;

interface Hours {

    static String getLampsLitForHours(final int hours) {
        return getLampsForFirstHourRow(hours).concat(ClockConstants.END_OF_LINE).concat(getLampsForSecondHourRow(hours)).concat(ClockConstants.END_OF_LINE);
    }

    //with java 9, we could have had this method as private
    static String getLampsForFirstHourRow(final int hours) {
        return LampsRule.getLampsLit(4, Utility.getOnLampsForFirstRows(hours));
    }

    //with java 9, we could have had this method as private
    static String getLampsForSecondHourRow(final int hours) {
        return LampsRule.getLampsLit(4, hours% ClockConstants.FIVE);
    }
}
