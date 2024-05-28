
public class Main {
    public static void main(String[] args) {
        //MenuGraphics menuGraphics = new MenuGraphics();
        {
            int N = 9, K = 50;
            Sudoku sudoku = new Sudoku(K);
            sudoku.fillValues();
            sudoku.printSudoku();
        }
    }
}