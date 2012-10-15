public class Script3{
	public static void main(String[] args){
		System.out.print ("Insert the number of rows of your matrix: ");
		int row = Integer.parseInt(System.console().readLine());
		System.out.print ("Insert the number of columns of your matrix: ");
		int col = Integer.parseInt(System.console().readLine());
		Matrix mat = new Matrix(row,col);
		mat.prettyPrint();

		//Set Element
		System.out.print ("Introduce the row where is the number you want to modify: ");
		row = Integer.parseInt(System.console().readLine());
		System.out.print ("Introduce the column where is the number you want to modify: ");
		col = Integer.parseInt(System.console().readLine());
		System.out.print ("Introduce the new value: ");
		int value = Integer.parseInt(System.console().readLine());
		mat.setElement(row,col,value);
		mat.prettyPrint();

		//Set Row
		System.out.print ("Introduce the row you want to modify: ");
		row = Integer.parseInt(System.console().readLine());
		System.out.print ("Introduce the new row in the form 1,2,....,n : ");
		String str=System.console().readLine();
		mat.setRow(row,str);
		mat.prettyPrint();

		//Set Column
		System.out.print ("Introduce the column you want to modify: ");
		col = Integer.parseInt(System.console().readLine());
		System.out.print ("Introduce the new column in the form 1,2,....,n : ");
		str=System.console().readLine();
		mat.setColumn(col,str);
		mat.prettyPrint();

		System.out.println(mat.toString());
	}
}