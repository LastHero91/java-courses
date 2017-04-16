public class Calculate{
	public static void main(String args[]){
		double first, second;
		double result;
		first=Double.valueOf(args[0]);
		second=Double.valueOf(args[1]);
		
		result=addition(first, second);
		printResult("addition result=", result);
		
		result=subtraction(first, second);
		printResult("subtraction result=", result);
		
		result=multiplication(first, second);
		printResult("multiplication result=", result);
		
		result=division(first, second);
		printResult("division result=", result);
		
		result=exponentiation(first, second);
		printResult("exponentiation result=", result);
		
		System.out.println("Calculation complete!");
	}
	
	private static double addition(double x, double y){
		return x+y;
	}
	
	private static double subtraction(double x, double y){
		return x-y;
	}
	
	private static double multiplication(double x, double y){
		return x*y;
	}
	
	private static double division(double x, double y){
		return x/y;
	}
	
	private static double exponentiation(double x, double y){
		double result=1;
		double abs = Math.abs(y);
		if(y==0){
			result=1;	
		}else{
			for(int i = 0; i<abs; i++){
				result = x * x;
			}
			if(y<0) {
				result = 1/result;
			}
		}
		return result;
	}
	
	private static void printResult(String act, double result){
		System.out.println(act+result);
	}
}