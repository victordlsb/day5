public class Script {
   public static void main(String[] args) {


    Calculator calc = new Calculator();
	System.out.print("Introduce the first number: ");
	int num1=Integer.parseInt(System.console().readLine());
	System.out.print("Introduce the second number: ");
	int num2=Integer.parseInt(System.console().readLine());
	System.out.println("\nSelect an option:\n");
	System.out.println("1- Add");
	System.out.println("2- Substract");
	System.out.println("3- Multiply");
	System.out.println("4- Divide");
	System.out.println("5- Module");
	double result=0;
	boolean optionCorrect = false;
	while (!optionCorrect){
		int option = Integer.parseInt(System.console().readLine());
		switch (option){
			case 1:
				result = (int) calc.add(num1,num2);
				optionCorrect = true;
				break;
			case 2:
				result = (int) calc.substract(num1,num2);
				optionCorrect = true;
				break;
			case 3:
				result = (int) calc.multiply(num1,num2);
				optionCorrect = true;
				break;
			case 4:
				result = calc.divide(num1,num2);
				optionCorrect = true;
				break;
			case 5:
				result = (int) calc.module(num1,num2);
				optionCorrect = true;
				break;
			default:
				System.out.println ("The option introduced is incorrect, please insert it again");
				break;
		}
	}
	System.out.print ("The result is: " + result);



   }
}
