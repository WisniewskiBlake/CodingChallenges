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
        char[][] array = {{'1','1','0','0','0'},{'1','1','0','0','0'},{'0',
                                                                       '0','1',
                                                               '0','0'},{'0',
                                                                         '0',
                                                                     '0','1',
                                                                         '1'}};
        char[][] array2 = {{'0','1','0'},{'1','0','1'},{'0','1','0'}};
        System.out.println(numIslands3(array2));
    }

    public static int numIslands(char[][] grid) {
        int islands = 0;
        int counter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    if(j == 0 && i == 0) {
                        islands++;
                    }
                    else if(i == 0) {
                        if(grid[i][j-1] == '0') {
                            islands++;
                        }
                    }
                    else if(j == 0 && grid[i-1][j] == '1') {

                    }
                    else if(j == 0 && grid[i][j+1] == '1' && grid[i-1][j] == '0') {
                        islands++;
                        counter++;
                    }
                    else if(j == 0 && grid[i][j+1] == '0' && grid[i-1][j] == '0') {
                        islands++;
                    }
                    else if(j == grid[0].length - 1 && grid[i][j-1] == '1') {
                        islands++;
                        islands = islands - counter;
                    }
                    else if(j == grid[0].length - 1 && grid[i-1][j] == '1') {

                    }
                    else if(j == grid[0].length - 1 && grid[i-1][j] == '0') {

                    }
                    else if(j == grid[0].length - 1 && i == grid.length - 1 &&
                            grid[i-1][j] == '1') {
                        islands = islands - counter;
                    }
                    else if(j == grid[0].length - 1 && i == grid.length - 1 &&
                            grid[i-1][j] == '0' && grid[i][j-1] == '0') {
                        islands++;
                    }
                    else if(grid[i-1][j] == '1') {

                    }
                    else if(grid[i][j+1] == '1' && grid[i-1][j] == '0') {
                        islands++;
                        counter++;
                    }
                    else if(grid[i][j+1] == '1' && grid[i-1][j] == '0' && grid[i][j-1] == '1') {
                        islands++;
                        counter++;
                    }
                    else if(grid[i][j+1] == '0' && grid[i-1][j] == '0' && grid[i][j-1] == '1') {
                        islands = islands - counter;
                    }
                    else if(grid[i][j+1] == '0' && grid[i-1][j] == '0' && grid[i][j-1] == '0') {
                        islands++;
                    }
                    else if(grid[i][j+1] == '1' && grid[i-1][j] == '1' && grid[i][j-1] == '1') {
                        islands = islands - counter;
                    }


                    else {
                        if(grid[i-1][j] == '0' && grid[i][j-1] == '0') {
                            if(j == grid[0].length - 1) {
                                islands++;
                            }
                            else if(grid[i-1][j+1] == '1' && grid[i][j+1] == '1') {

                            }
                            else {
                                islands++;
                            }
                        }
                    }
                }
            }
            
        }
        return islands;
    }


    public static int numIslands1(char[][] grid) {
        int islands = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    if(j == 0 && i == 0) {
                        islands++;
                    }
                    else if(i == 0) {
                        if(grid[i][j-1] == '0') {
                            islands++;
                        }
                    }
                    else if(j == 0) {
                        if(grid[i-1][j+1] == '1' && grid[i][j+1] == '1') {

                        }
                        if(grid[i-1][j] == '0') {
                            islands++;
                        }
                    }

                    else {
                        if(grid[i-1][j] == '0' && grid[i][j-1] == '0') {
                            if(j == grid[0].length - 1) {
                                islands++;
                            }
                            else if(grid[i-1][j+1] == '1' && grid[i][j+1] == '1') {

                            }
                            else {
                                islands++;
                            }
                        }
                    }
                }
            }

        }
        return islands;
    }

    static void dfs(char[][] grid, int r, int c) {
        int nr = grid.length;
        int nc = grid[0].length;

        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    public static int numIslands3(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;
        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                if (grid[r][c] == '1') {
                    ++num_islands;
                    dfs(grid, r, c);
                }
            }
        }

        return num_islands;
    }





































}
