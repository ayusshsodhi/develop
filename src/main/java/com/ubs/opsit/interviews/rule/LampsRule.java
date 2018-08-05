package com.ubs.opsit.interviews.rule;

import com.ubs.opsit.interviews.constants.ClockConstants;

public interface LampsRule {

    static String getLampsLit(final int totalLamps, final int onLamps) {
        return getLampsLit(totalLamps, onLamps, String.valueOf(ClockConstants.RED_LIGHT));
    }

    static String getLampsLit(final int totalLamps, final int onLamps, final String onLight) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < totalLamps; i++) {
            if(i < onLamps){
                if(totalLamps == 11 && result.length()%3==2)
                    result.append(ClockConstants.RED_LIGHT);
                else
                    result.append(onLight);
            }
            else
                result.append(ClockConstants.OFF_LIGHT);
        }
        return result.toString();
    }
}
