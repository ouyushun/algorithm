package gcd;

/**
 * @Author ouyushun
 * @Date 2022/2/9
 * @Version 1.0
 */
public class Solution {
    public int gcd(int x, int y) {
        return y > 0 ? gcd(y, x % y) : x;
    }

    public boolean hasGroupsSizeX(int[] deck) {
        int[] num = new int[10004];
        for (int x : deck) {
            ++num[x];
        }
        int g = 0;
        for (int i = 0; g != 1 && i < num.length; ++i) {
            g = gcd(g, num[i]);
        }
        return g > 1;
    }
}
