package Level2PowerHungry;

import java.math.BigInteger;


public class Solution {
    public static String solution(int[] xs) {
        BigInteger res = new BigInteger("1");
        int size = xs.length, pos = 0, neg = 0;
        int[] negatives = new int[size];
        if (size == 1) {
            return Integer.toString(xs[0]);
        }

        for (int value : xs) {
            if (value == 0) {
                continue;
            }
            if (value > 0) {
                res = res.multiply(new BigInteger(Integer.toString(value)));
                neg++;
            } else {
                negatives[pos] = value;
                pos++;
            }
        }
        if (neg == 0) {
            int l = 0;
            return Integer.toString(l);
        }
        if ((pos % 2) == 0) {

            for (int i = 0; i < pos; i++) {
                res = res.multiply(new BigInteger(Integer.toString(negatives[i])));
            }
        } else {

            int minimum = -1000;
            int minimumPosition = -1;
            for (int x = 0; x < pos; x++) {
                if (negatives[x] > minimum) {
                    minimum = negatives[x];
                    minimumPosition = x;
                }
            }
            for (int y = 0; y < pos; y++) {
                if (y == minimumPosition) {
                    continue;
                }
                res = res.multiply(new BigInteger(Integer.toString(negatives[y])));
            }
        }


        return res.toString();
    }

    public static void main(String[] args) {
        assert solution(new int[] {2, 0, 2, 2, 0}).equals("8");
        assert solution(new int[] {-2, -3, 4, -5}).equals("60");
    }
    }

