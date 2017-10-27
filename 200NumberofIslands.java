class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null) return 0;
        int sum = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == '1'){
                    clearTheIsland(grid, i, j);
                    sum ++;
                }
            }
        }
        return sum;
    }
    
    private void clearTheIsland(char[][] grid, int i, int j){
        if(i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == '1'){
            grid[i][j] = '0';
            clearTheIsland(grid, i+1, j);
            clearTheIsland(grid, i-1, j);
            clearTheIsland(grid, i, j+1);
            clearTheIsland(grid, i, j-1);
        }

    }
}
