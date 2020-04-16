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
}