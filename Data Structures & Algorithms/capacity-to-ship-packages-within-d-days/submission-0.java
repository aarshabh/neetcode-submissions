class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 0, r = 0;
        for (int w : weights) {
            l = Math.max(l, w);
            r += w;
        }

        int res = r;

        while (l <= r) {
            int mid = (l+r)/2;
            if (canShip(weights, days, mid)) {
                res = Math.min(res, mid);
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }

    private boolean canShip (int[] weights, int days, int cap) {
        int ships = 1, currCap = cap;
        for (int w: weights) {
            if (currCap - w < 0) {
                ships++;
                if (ships > days)
                    return false;
                currCap = cap;
            }
            currCap -= w;
        }
        return true;
    }
}