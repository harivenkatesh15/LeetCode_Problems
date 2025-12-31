class Solution {

    static class DSU {
        int[] parent;

        DSU(int n) {
            parent = new int[n];
            Arrays.fill(parent, -1);
        }

        int find(int v) {
            if (parent[v] == -1) return v;
            parent[v] = find(parent[v]);
            return parent[v];
        }

        void union(int u, int v) {
            int pu = find(u);
            int pv = find(v);
            if (pu == pv) return;
            parent[pu] = pv;
        }
    }

    public int latestDayToCross(int row, int col, int[][] cells) {

        int base = row * col + 5;
        DSU dsu = new DSU(base + 5);

        int TOP = base + 1;
        int BOTTOM = base + 2;

        boolean[][] land = new boolean[row][col];
        int[] dir = {-1, 0, 1, 0, -1};

        for (int day = cells.length - 1; day >= 0; day--) {

            int r = cells[day][0] - 1;
            int c = cells[day][1] - 1;
            land[r][c] = true;

            int id = r * col + c;

            if (r == 0) dsu.union(id, TOP);
            if (r == row - 1) dsu.union(id, BOTTOM);

            for (int i = 0; i < 4; i++) {
                int nr = r + dir[i];
                int nc = c + dir[i + 1];

                if (nr < 0 || nr >= row || nc < 0 || nc >= col)
                    continue;

                if (land[nr][nc]) {
                    dsu.union(id, nr * col + nc);
                }
            }

            if (dsu.find(TOP) == dsu.find(BOTTOM))
                return day;
        }
        return 0;
    }
}