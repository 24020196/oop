// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
        int n = grid.length;
        int m = grid[0].length;
        int tren = n, duoi = -1, trai = m, phai = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == ch) {
                    tren = Math.min(tren, i);
                    duoi = Math.max(duoi, i);
                    trai = Math.min(trai, j);
                    phai = Math.max(phai, j);
                }
            }
        }

        if (duoi == -1) return 0;
        return (duoi - tren + 1) * (phai - trai + 1);
	}


	public int countPlus() {
		return 0; // YOUR CODE HERE
	}
	
}
