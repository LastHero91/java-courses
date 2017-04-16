public class Calculate{
	public static void main(String args[]){
		int first, second, result;
		first=Integer.valueOf(args[0]);
		second=Integer.valueOf(args[1]);
		result=multiplay(first, second);
		System.out.println("result="+result);
		System.out.println("Complete!");
	}
	
	private static int multiplay(int x, int y){
		return x+y;
	}
}