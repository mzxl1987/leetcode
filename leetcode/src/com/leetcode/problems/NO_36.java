package com.leetcode.problems;

/**
 * 36. Valid Sudoku
 * @author Administrator
 *
 */
public class NO_36 {

	public boolean isValidSudoku(char[][] board) {
        String nums = "0123456789";
		int[] rows = new int[9];
		int[] columns = new int[9];
		int[] grids = new int[9];
		
		char tmp_char;
		int move;
		
		for(int r = 0,max_r = board.length; r < max_r; r++){
			for(int c = 0,max_c = board[r].length; c < max_c; c++){
				tmp_char = board[r][c];
				if(".".equals(tmp_char)) continue;
				if("0".equals(tmp_char)) return false;
				
				move = 1 << nums.indexOf(tmp_char);
				if((rows[r] & move) != 0) return false;
				rows[r] |= move;
				
				if((columns[c] & move) != 0) return false;
				columns[c] |= move;
				
				if(r < 3){
					if(c < 3){  //grid 1
						grids[((r % 3) * 3) + (c % 3)] =   
					}else if(c < 6){  //grid 2
						
					}else{   //grid 3
						
					}
				}else if(r < 6){  //grid 4
					if(c < 3){
						
					}else if(c < 6){  //grid 5
						
					}else{  //grid 6
						
					}
				}else{
					if(c < 3){  //grid 7
						
					}else if(c < 6){  //grid 8 
						
					}else{  //grid 9
						
					}
				}
				
			}
		}
		
		return true;
    }
	
}
