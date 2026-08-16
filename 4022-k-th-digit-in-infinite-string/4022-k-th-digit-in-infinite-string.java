class Solution {
    public int kthDigit(long k) {
        if(k <= 9) return (int)k;
        k = k-9;

        long d = 2, b = 1, cnt = 9;
        while(cnt <= (k-1)/ (10 *d)){
            k -= cnt * (10 * d);
            d++;
            b *= 10;
            cnt *= 10;
        }
        k--;

        long blk = b + k / (10 * d);
        long rem = k % (10 * d);
        long pos = rem /d;
        long off = rem % d;

        long num = (blk % 2 == 0)? 10 * blk + pos : 10 * blk + (9-pos);
        return String.valueOf(num).charAt((int) off) - '0';
    }
}