import javax.swing.*;
class Example4{
	static int a;
	static {
		int x=Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
		for(int i=0; i<x; i++){
			a=a+1;
			System.out.println(a);
		}
	}
	public void x1(){
		System.out.println(a+10);
	}
}

class Example3{
	public static void main(String args[]){
	Example4 ob=new Example4();
	ob.x1();
	}
}