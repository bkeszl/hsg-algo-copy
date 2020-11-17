package com.gfa.trialexam.solution;

public class AverageOfEveryNth {
    public static void main(String[] args) {
        /*
        Készíts egy `averageOfEveryNth` nevű függvényt, ami két paramétert kér:

        - egy `numbers` nevű tömböt pozitív integer-ekkel,
        - egy `n` nevű pozitív integer-t.

        A metódusnak azt az átlagot kell kiszámolnia,
        amely a tömb minden `n`-edik eleméből származik és
        vissza kell vele térnie.

        Példák:

        averageOfEveryNth([2, 4, 10, 34, 3, 16, 3, 21], 3)

        Amivel vissza kellene térnie: `13`, mert `10` és `16` átlaga `13`.

        averageOfEveryNth([2, 4, 10, 34, 3, 16, 3, 21], 2)

        Amivel vissza kellene térnie: `18.75`, mert `4`, `34`, `16`, `21` átlaga `18.75`.

        averageOfEveryNth([2, 4, 10, 34, 3, 16, 3, 21], 10)


        Amivel vissza kellene térnie: `0`, mert nincs érvényes elem.
    */
        int[] array = {2, 4, 10, 34, 3, 16, 3, 21};
        System.out.println(averageOfEveryNth(array, 3));
    }

    public static float averageOfEveryNth(int[] array, int n) {
        if (n < 1 || n > array.length - 1 ) {
            return 0;
        }
        float avg = 0;
        int elementCount = array.length / n;
        int[] elements = new int[elementCount];
        for (int i = 0; i < elementCount; i++) {
            elements[i] = array[((i + 1) * n) - 1];
        }
        float sum = 0;
        for (int element : elements) {
            sum += element;
        }
        avg = sum / elementCount;
        return avg;
    }
}
