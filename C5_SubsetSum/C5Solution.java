package C5_SubsetSum;

public class C5Solution {
    private boolean[][] dpTable;
	private int[] numbers;
	private int sum;
	
	public C5Solution(int[] numbers, int sum){
		this.numbers = numbers;
		this.sum = sum;
		this.dpTable = new boolean[numbers.length + 1][sum + 1];	
    }
    
    public void solveProblem() {
				
        //		for(int i=0;i<=this.sum;i++){ // if sum is not zero and subset is 0 -> no feasible solution
        //			this.dpTable[0][i] = false;
        //		}
                
                for(int i=0;i<=this.numbers.length;i++){ // if sum is 0 the we can make the empty subset to make sum 0
                    this.dpTable[i][0]=true;
                }
                
                for(int rowIndex=1;rowIndex<=numbers.length;++rowIndex){
                    for(int columnIndex=1;columnIndex<=sum;++columnIndex){				
                        
                        if( columnIndex < numbers[rowIndex-1] ){
                            this.dpTable[rowIndex][columnIndex] = this.dpTable[rowIndex-1][columnIndex];
                        }else{
                            if( this.dpTable[rowIndex-1][columnIndex] ){
                                this.dpTable[rowIndex][columnIndex] = true;
                            }else{
                                this.dpTable[rowIndex][columnIndex] = this.dpTable[rowIndex-1][columnIndex-numbers[rowIndex-1]];
                            }
                        }				
                    }
                }
            }
}