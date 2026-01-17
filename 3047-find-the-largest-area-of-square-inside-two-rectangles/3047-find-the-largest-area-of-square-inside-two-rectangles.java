import java.util.*;

class Solution {
    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        int n = bottomLeft.length;
        int[][] rectangles = new int[n][4];

        for (int i = 0; i < n; i++) {
            rectangles[i][0] = bottomLeft[i][0];
            rectangles[i][1] = bottomLeft[i][1];
            rectangles[i][2] = topRight[i][0];
            rectangles[i][3] = topRight[i][1];
        }

        Arrays.sort(rectangles, (a, b) -> {
            for (int i = 0; i < 4; i++) {
                if (a[i] != b[i]) return a[i] - b[i];
            }
            return 0;
        });

        long maxArea = 0;

        int xi1, xi2, yi1, yi2;
        int xj1, xj2, yj1, yj2;
        int blx, bly, trx, try_;
        long sqSide;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                xi1 = rectangles[i][0];
                yi1 = rectangles[i][1];
                xi2 = rectangles[i][2];
                yi2 = rectangles[i][3];

                xj1 = rectangles[j][0];
                yj1 = rectangles[j][1];
                xj2 = rectangles[j][2];
                yj2 = rectangles[j][3];

                if (yj1 >= yi1 && yj1 <= yi2) {
                    if (xj1 >= xi1 && xj1 <= xi2) {
                        blx = xj1;
                        bly = yj1;
                        trx = Math.min(xj2, xi2);
                        try_ = Math.min(yi2, yj2);
                        sqSide = Math.min(trx - blx, try_ - bly);
                        maxArea = Math.max(maxArea, sqSide * sqSide);
                    }
                } else if (yj2 >= yi1 && yj2 <= yi2) {
                    if (xj1 >= xi1 && xj1 <= xi2) {
                        blx = xj1;
                        bly = yi1;
                        trx = Math.min(xi2, xj2);
                        try_ = yj2;
                        sqSide = Math.min(trx - blx, try_ - bly);
                        maxArea = Math.max(maxArea, sqSide * sqSide);
                    }
                } else if (xj1 >= xi1 && xj1 <= xi2) {
                    if (yj1 < yi1 && yj2 > yi2) {
                        blx = xj1;
                        bly = yi1;
                        trx = Math.min(xj2, xi2);
                        try_ = yi2;
                        sqSide = Math.min(trx - blx, try_ - bly);
                        maxArea = Math.max(maxArea, sqSide * sqSide);
                    }
                }
            }
        }
        return maxArea;
    }
}
