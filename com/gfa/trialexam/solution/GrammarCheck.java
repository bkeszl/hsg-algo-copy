package com.gfa.trialexam.solution;

import java.util.Arrays;

public class GrammarCheck {
    public static void main(String[] args) {
    /*
    Készíts egy függvényt, amely egy string-et (`text`) kér paraméterként és
    ellenőrzi, hogy a `.` írásjelek után az első betűk nagybetűk-e és
    egy boolean-nel (logikai értékkel) tér vissza.

    Példák:

    grammarCheck("Ez egy jó példa. Ez egy jó példa.");

    Amivel vissza kellene térnie: `true`.

    grammarCheck("ez még mindig egy jó példa. Hiszen a második mondat nagybetűvel kezdődik.");

    Amivel vissza kellene térnie: `true`.

    grammarCheck("Ez egy rossz példa. itt nincs nagybetű.");

    Amivel vissza kellene térnie: `false`.
    */
        System.out.println(grammarCheck("Ez egy jó példa. Ez egy jó példa."));
        System.out.println(grammarCheck("Ez egy rossz példa. Itt nincs nagybetű."));
    }

    public static boolean grammarCheck(String text) {
        boolean isCorrect = true;
        char[] inputAsArray = text.toCharArray();
        for (int i = 0; i < inputAsArray.length - 2; i++) {
            if (inputAsArray[i] == '.' && !((inputAsArray[i + 2] < 90 && inputAsArray[i + 2] > 65))) {
                return false;
            }
        }
        return isCorrect;
    }
}
