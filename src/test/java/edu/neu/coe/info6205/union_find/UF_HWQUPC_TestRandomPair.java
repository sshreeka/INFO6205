package edu.neu.coe.info6205.union_find;

import java.util.Random;

public class UF_HWQUPC_TestRandomPair {
    public static int randomNum(int min, int max) {
        Random random = new Random();
        return random.ints(min, max)
                .findFirst()
                .getAsInt();
    }

    public static int getConnections(UF_HWQUPC h, int noOfSites) {
        int noofPairs = 0;
        while (h.components() != 1) {
            h.connect(randomNum(0, noOfSites), randomNum(0, noOfSites));
            noofPairs++;

        }
        return noofPairs;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            int num = randomNum(0, 1000);
            UF_HWQUPC h = new UF_HWQUPC(num);
            int noOfconns = getConnections(h, num);
            System.out.println("Number of sites:" + num + " Number of connections:"+ noOfconns);
        }

    }
}
