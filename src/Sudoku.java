import java.util.ArrayList;
/**
 * The Sudoku class represents a Sudoku puzzle and provides methods to generate, solve, and manipulate the puzzle.
 */
public class Sudoku {
    private int[][] mat;
    private int[][] filledMat = new int[9][9];
    private int N=9;
    private int SRN;
    private int K;

    public Sudoku() {
    }
    /**
     * Constructs a Sudoku object with the specified grid size and number of empty cells.
     *
     * @param K the number of empty cells to be generated
     */
     Sudoku(int K)
    {
        this.K = K;
        Double SRNd = Math.sqrt(N);
        SRN = SRNd.intValue();

        mat = new int[N][N];
    }
    /**
     * Generates a Sudoku puzzle by filling the grid with valid values.
     */
    public void fillValues()
    {
        fillDiagonal();
        fillRemaining(0, SRN);
        setfilledMat();
        removeKDigits();

    }
    /**
     * Fills the diagonal sub-grids of the puzzle.
     */
    void fillDiagonal()
    {

        for (int i = 0; i<N; i=i+SRN)
            fillBox(i, i);
    }
    /**
     * Checks if a number is unused in a sub-grid.
     *
     * @param rowStart the starting row of the sub-grid
     * @param colStart the starting column of the sub-grid
     * @param num the number to check
     * @return true if the number is unused, false otherwise
     */
    boolean unUsedInBox(int rowStart, int colStart, int num)
    {
        for (int i = 0; i<SRN; i++)
            for (int j = 0; j<SRN; j++)
                if (mat[rowStart+i][colStart+j]==num)
                    return false;

        return true;
    }
    /**
     * Fills a sub-grid with valid values.
     *
     * @param row the starting row of the sub-grid
     * @param col the starting column of the sub-grid
     */
    void fillBox(int row,int col)
    {
        int num;
        for (int i=0; i<SRN; i++)
        {
            for (int j=0; j<SRN; j++)
            {
                do
                {
                    num = randomGenerator(N);
                }
                while (!unUsedInBox(row, col, num));

                mat[row+i][col+j] = num;
            }
        }
    }
    /**
     * Generates a random number between 1 and N.
     *
     * @param num the upper bound of the random number
     * @return a random number between 1 and num
     */
    int randomGenerator(int num)
    {
        return (int) Math.floor((Math.random()*num+1));
    }
    /**
     * Checks if a number is safe to place at a given position in the puzzle.
     *
     * @param i the row of the position
     * @param j the column of the position
     * @param num the number to check
     * @return true if the number is safe, false otherwise
     */
    boolean CheckIfSafe(int i,int j,int num)
    {
        return (unUsedInRow(i, num) &&
                unUsedInCol(j, num) &&
                unUsedInBox(i-i%SRN, j-j%SRN, num));
    }
    /**
     * Checks if a number is unused in a row.
     *
     * @param i the row to check
     * @param num the number to check
     * @return true if the number is unused, false otherwise
     */
    boolean unUsedInRow(int i,int num)
    {
        for (int j = 0; j<N; j++)
            if (mat[i][j] == num)
                return false;
        return true;
    }
    /**
     * Checks if a number is unused in a column.
     *
     * @param j the column to check
     * @param num the number to check
     * @return true if the number is unused, false otherwise
     */
    boolean unUsedInCol(int j,int num)
    {
        for (int i = 0; i<N; i++)
            if (mat[i][j] == num)
                return false;
        return true;
    }
    /**
     * Fills the remaining empty cells in the puzzle with valid values.
     *
     * @param i the current row
     * @param j the current column
     * @return true if the puzzle is solved, false otherwise
     */
    boolean fillRemaining(int i, int j)
    {
        if (j>=N && i<N-1)
        {
            i = i + 1;
            j = 0;
        }
        if (i>=N && j>=N)
            return true;

        if (i < SRN)
        {
            if (j < SRN)
                j = SRN;
        }
        else if (i < N-SRN)
        {
            if (j==(int)(i/SRN)*SRN)
                j =  j + SRN;
        }
        else
        {
            if (j == N-SRN)
            {
                i = i + 1;
                j = 0;
                if (i>=N)
                    return true;
            }
        }
        for (int num = 1; num<=N; num++)
        {
            if (CheckIfSafe(i, j, num))
            {
                mat[i][j] = num;
                if (fillRemaining(i, j+1))
                    return true;
                mat[i][j] = 0;
            }
        }
        return false;
    }
    /**
     * Removes K digits from the puzzle to create empty cells.
     */
    public void removeKDigits()
    {
        int count = K;
        while (count != 0)
        {
            int cellId = randomGenerator(N*N)-1;

            int i = (cellId/N);
            int j = cellId%N;
            if (mat[i][j] != 0)
            {
                count--;
                mat[i][j] = 0;
            }
        }
    }
    /**
     * Sets the filled puzzle matrix.
     */
    public void setfilledMat()
    {
        for (int i = 0; i<N; i++) {
            for (int j = 0; j<N; j++) {
                if (mat[i][j] != 0) {
                    filledMat[i][j] = mat[i][j];
                }
            }
        }
    }
    /**
     * Sets the coordinates of the numbers.
     *
     * @return a list of coordinates
     */
    public ArrayList<Coordinates> setCoordinates()
    {
        ArrayList<Coordinates> coordinates = new ArrayList<>();
        for (int i = 0; i<N; i++)
        {
            for (int j = 0; j<N; j++) {
                if (mat[i][j] != 0) {
                    coordinates.add(new Coordinates((j+1)*100+35,(400-(i+1)*100)*-1));
                }
            }
        }
        return coordinates;
    }
    /**
     * Sets the values of the puzzle cells.
     *
     * @return a list of values
     */
    public ArrayList<Integer> setValues()
    {
        ArrayList<Integer> values = new ArrayList<>();
        for (int i = 0; i<N; i++) {
            for (int j = 0; j<N; j++) {
                if (mat[i][j] != 0) {
                    values.add(mat[i][j]);
                }
            }
        }
        return values;
    }
    /**
     * Sets the solved values of the puzzle cells.
     *
     * @return a list of solved values
     */
    public ArrayList<Integer> setSolvedValues()
    {
        ArrayList<Integer> solvedValues = new ArrayList<>();
        for (int i = 0; i<9; i++)
        {
            for (int j = 0; j<9; j++) {
                    solvedValues.add(filledMat[i][j]);
            }
        }
        return solvedValues;
    }
    /**
     * Prints the Sudoku puzzle.
     */
    public void printSudoku()
    {
        for (int i = 0; i<N; i++)
        {
            for (int j = 0; j<N; j++)
                System.out.print(filledMat[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i<N; i++)
        {
            for (int j = 0; j<N; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
        System.out.println();
    }
}