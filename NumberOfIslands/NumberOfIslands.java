package NumberOfIslands;

//Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
//
//        Example 1:
//
//        Input:
//        11110
//        11010
//        11000
//        00000
//
//        Output: 1
//        Example 2:
//
//        Input:
//        11000
//        11000
//        00100
//        00011
//
//        Output: 3

public class NumberOfIslands {

    public static void main(String[] args) {
        char[][] array =
                {{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0',
                                                                        '0',
                                                                        '1',
                                                                        '0',
                                                                        '0'},
                 {'0',
                  '0',
                  '0', '1',
                  '1'}};
        char[][] array2 = {{'0', '1', '0', '0'}, {'1', '1', '0', '0'}, {'0', '0', '1', '0'}};
        System.out.println(numIslands3(array2));
    }


    static void dfs(char[][] grid, int row, int column) {
        int columnLength = grid.length;
        int rowLength = grid[0].length;

        if (row < 0 || column < 0 || row >= columnLength || column >= rowLength || grid[row][column] == '0') {
            return;
        }

        grid[row][column] = '0';
        dfs(grid, row - 1, column);
        dfs(grid, row + 1, column);
        dfs(grid, row, column - 1);
        dfs(grid, row, column + 1);
    }

    public static int numIslands3(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rowLength = grid.length;
        int columnLength = grid[0].length;
        int islands = 0;
        for (int row = 0; row < rowLength; row++) {
            for (int column = 0; column < columnLength; column++) {
                if (grid[row][column] == '1') {
                    islands++;
                    dfs(grid, row, column);
                }
            }
        }
        return islands;
    }
}
