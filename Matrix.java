public class Matrix{
	private int mat[][];

	public int giveRowSize(){
		return mat.length;
	}

	public int giveColSize(){
		return mat[0].length;
	}

	public int giveElement(int row,int col){
		return mat[row][col];
	}

	public void setElement(int row,int col,int value){
		if (row + 1 < giveRowSize() && col + 1 < giveColSize() && row >= 0 && col >= 0){
			mat[row][col]=value;
		}
	}

	public Matrix(int row,int col){
		mat = new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				mat[i][j] = 1;
			}
		}
	}

	public void setRow(int row,String str){
		boolean allIntegers = true;
		boolean correctSize = true;
		if (row >= 0 && row < giveRowSize() && str.length() > 0){
			int numberCount = 1;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i) == ','){
					numberCount++;
				}else if(!Character.isDigit(str.charAt(i))){
					allIntegers = false;
				}
			}
			if (numberCount != giveColSize()){
				correctSize = false;
			}
			if(correctSize && allIntegers){
				int firstDigit = 0;
				int col = 0;
				for (int i=0;i<str.length();i++){
					if (str.charAt(i)== ','){
						setElement(row,col,Integer.parseInt(str.substring(firstDigit,i)));
						firstDigit=i+1;
						col+=1;
					}
					if(col==giveColSize()-1){
						setElement(row,col,Integer.parseInt(str.substring(firstDigit)));
					}
				}
			}
		}
	}

	public void setColumn(int col,String str){
		boolean allIntegers = true;
		boolean correctSize = true;
		if (col >= 0 && col < giveColSize() && str.length() > 0){
			int numberCount = 1;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i) == ','){
					numberCount++;
				}else if(!Character.isDigit(str.charAt(i))){
					allIntegers = false;
				}
			}
			if (numberCount != giveColSize()){
				correctSize = false;
			}
			if(correctSize && allIntegers){
				int firstDigit = 0;
				int row = 0;
				for (int i=0;i<str.length();i++){
					if (str.charAt(i)== ','){
						setElement(row,col,Integer.parseInt(str.substring(firstDigit,i)));
						firstDigit=i+1;
						row+=1;
					}
					if(row==giveRowSize()-1){
						setElement(row,col,Integer.parseInt(str.substring(firstDigit)));
					}
				}
			}
		}
	}

	public String toString(){
		String result = "[";
		for (int row=0;row<giveRowSize();row++){
			for(int col=0;col<giveColSize();col++){
				result = result + Integer.toString(giveElement(row,col));
				if (col==giveColSize()-1){
					if(row!=giveRowSize()-1){
						result = result + ";";
					}else{
						result = result + "]";
					}
				}else{
					result = result + ",";
				}
			}
		}
		return result;
	}

	public void prettyPrint(){
		for (int row=0;row<giveRowSize();row++){
			for(int col=0;col<giveColSize();col++){
				System.out.print (giveElement(row,col) + "\t");
				if (col==giveColSize()-1){
					System.out.println ("");
				}
			}
		}
	}
}



