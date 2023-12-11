/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

    private int openSites;
    private int n;
    private WeightedQuickUnionUF uf;
    private boolean[] sites;


    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {

        if (n <= 0) {
            throw new IllegalArgumentException();
        }

        uf = new WeightedQuickUnionUF(n * n + 2);
        sites = new boolean[n * n + 2];

        this.n = n;
        openSites = 0;

    }

    private void checkSpot(int row, int col) {

        if (row < 1 || row > n || col < 1 || col > n) {
            throw new IllegalArgumentException();
        }

    }

    private int idx(int row, int col) {

        return (row - 1) * n + (col - 1);

    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {

        checkSpot(row, col);

        int cur = idx(row, col);
        if (!sites[cur]) {
            sites[cur] = true;
            openSites++;

            if (row == 1) {
                uf.union(cur, 0);
            }
            if (row == n) {
                uf.union(cur, n * n + 1);
            }

            if (row != 1 && isOpen(row - 1, col)) {
                assert (cur > n);
                uf.union(cur, cur - n);
            }

            if (row != n && isOpen(row + 1, col)) {
                assert (cur + n < n * n);
                uf.union(cur, cur + n);
            }

            if (col != 1 && isOpen(row, col - 1)) {
                uf.union(cur, cur - 1);
            }
            if (col != n && isOpen(row, col + 1)) {
                uf.union(cur, cur + 1);
            }
        }

    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        checkSpot(row, col);
        return sites[idx(row, col)];
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {

        checkSpot(row, col);
        if (!isOpen(row, col)) {
            return false;
        }
        return uf.connected(idx(row, col), 0);

    }

    // returns the number of open sites
    public int numberOfOpenSites() {

        return openSites;

    }

    // does the system percolate?
    public boolean percolates() {

        return uf.connected(0, n * n + 1);

    }


    public static void main(String[] args) {
        // test client (optional)
    }

}
