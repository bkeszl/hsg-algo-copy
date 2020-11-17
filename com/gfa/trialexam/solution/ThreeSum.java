package com.gfa.trialexam.solution;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
    /*
    Készíts egy `threeSum`nevű függvényt, ami

    - egy integer(egész szám) tömböt(`array`) kér inputként,
    - talál 3 * különböző * elemet
    (az értékük megegyezhet, de az indexük különböző kell legyen)
    a tömbben, megkeresi a 3 legkissebb elem összegét és
    - visszatér a legkisebb összeggel integer -ként.
    - -1-gyel tér vissza, ha a tömb mérete kisebb, mint 3.

    Példák:

    threeSum([1, 2, 3, 4, 5]);

    Amivel vissza kellene térnie: `6`,mert `1`, `2`és `3`
    adja a legkisebb összeget.

    threeSum([100, 450, 200, 5]);

    Amivel vissza kellene térnie: `305`,mert `100`, `200`és `5`
    adja a legkisebb összeget.


    threeSum([1, 2]);

    Amivel vissza kellene térnie: `-1`mert nincs 3 különböző szám a tömbben.
    */
        int[] array = {1, 2};
        System.out.println(threeSum(array));
    }

    public static int threeSum(int[] arr) {
        if (arr.length < 3) {
            return -1;
        }
        int result = 0;
        Arrays.sort(arr);
        int[] minThree = {arr[0], arr[1], arr[2]};
        for (int j : minThree) {
            result += j;
        }
        return result;
    }
}

