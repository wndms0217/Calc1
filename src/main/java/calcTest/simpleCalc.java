package calcTest;

public class simpleCalc {
	private int result = 0;
	
	public void add(int x, int y){
		result = x+y;
	}
	
	public void sub(int x, int y){
		result = x-y;
	}

	public void mul(int x, int y){
		result = x*y;
	}

	public void div(int x, int y){
		if(y!=0) result = x/y; //y�� 0�� �ƴ� ���
		else System.out.println("�и� 0�Դϴ�.");
	}
	
	public void inc(int x){
		result +=x;
	}
	
	public int getResult(){
		return result;
	}
	
	
}
