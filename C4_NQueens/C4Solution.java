package C4_NQueens;

public class C4Solution {
    private int[][] chessTable;
	private int numOfQueens;
	
	public C4Solution(int numOfQueens) {
		this.chessTable = new int[numOfQueens][numOfQueens];
		this.numOfQueens = numOfQueens;
	}
}