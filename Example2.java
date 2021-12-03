import javax.swing.*;
class Example1{
	int a;
	{
		int x=JOptionPane.showInputDialog("Enter a number:");
		for(int i=0; i<x; i++){
			a=a+1;
			System.out.println(a);
		}
	}
	public void x1(){
		System.out.println(a+10);
	}
}

class Example2{
	public static void main(String args[]){
	Example1 ob=new Example1();
	ob.x1();
	}
}