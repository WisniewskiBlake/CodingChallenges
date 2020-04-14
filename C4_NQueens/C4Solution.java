package C4_NQueens;

public class C4Solution {
    private int[][] chessTable;
	private int numOfQueens;
	
	public C4Solution(int numOfQueens) {
		this.chessTable = new int[numOfQueens][numOfQueens];
		this.numOfQueens = numOfQueens;
    }

    public void solve() {
		
		if(setQueens(0) ) {
			printQueens();
		} else {
			System.out.println("There is no solution...");
		}
	}
    
    private boolean setQueens(int colIndex) {

		if( colIndex == numOfQueens ) {
			return true;
		}
		
		for(int rowIndex=0;rowIndex<numOfQueens;++rowIndex) {
			
			if(isPlaceValid(rowIndex, colIndex) ) {
				
				chessTable[rowIndex][colIndex] = 1;
				
				if( setQueens(colIndex+1) ) {
					return true;
				}
				
				// BACKTRACKING !!!
				chessTable[rowIndex][colIndex] = 0;
			}
		}
		
		return false;
	}
}