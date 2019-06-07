package chapter4.exercise416;



class Square { 
	
	public void print_square(int squareSize) {
		int row, column; 
		
		for (row = 1; row <= squareSize; row++) {
			
			for (column = 1; column <= squareSize; column++) { 
				
				if (row == 1 || row == squareSize || 
					column == 1 || column == squareSize)			 
					System.out.printf("%6s", "*");			 
				else		
					System.out.printf("%7s", " ");			 
			} 
			System.out.println(); 
		} 
	
	} 
} 
