public class jisuan {
	private static int result;//静态变量，用于存储运行结果
	public void add(int n){
		result=result+n;
	}
	public void substract(int n){
		result=result-1;
	}
	
	public void clear(){
		result=0;
	}
	public int getResult(){
		return result;
	}

}