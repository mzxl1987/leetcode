package com.leetcode.problems;

/**
 * 36. Valid Sudoku
 * @author Administrator
 *
 */
public class NO_36 {

	public boolean isValidSudoku(char[][] board) {
        final char ZERO = '0';
		int[] rows = new int[9];
		int[] columns = new int[9];
		int[] grids = new int[9];
		final int GRID = 3;
		
		char tmp_char;
		int move;
		
		for(int r = 0,max_r = board.length; r < max_r; r++){
			for(int c = 0,max_c = board[r].length; c < max_c; c++){
				tmp_char = board[r][c];
				
				if('0' == tmp_char) return false;
				if('.' != tmp_char){
					move = 1 << (tmp_char - ZERO);
					if((rows[r] & move) != 0 || (columns[c] & move) != 0 || (grids[((r / GRID) * GRID) + (c / GRID)] & move) != 0)  return false;
					
					rows[r] |= move;
					columns[c] |= move;
					grids[((r / GRID) * GRID) + (c / GRID)] |= move;
				}				
			}
		}
		
		return true;
    }
	
	public static void main(String[] args) {
		
		char[][] sudu = {{'5','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};
		
		NO_36 t = new NO_36();
		System.out.println(t.isValidSudoku(sudu));
		
	}
	
}
