import javax.swing.*;
class cake{
	int ck=500;
	{
	String x=JOptionPane.showInputDialog("Total no of cake:");
	int s1=Integer.parseInt(x);
	System.out.println("Price for cake:"+ ck*s1);
	}
}

class launch{
	int lnch=300;
	{
	String y=JOptionPane.showInputDialog("Total no of people for launch:");
	int s2=Integer.parseInt(y);
	System.out.println("Price for launch:"+ lnch*s2);
	}
}

class dinner{
	int dnr=200;
	{
	String z=JOptionPane.showInputDialog("Total no of people for dinner:");
	int s3=Integer.parseInt(z);
	System.out.println("Price for cake:"+ dnr*s3);
	}
}

class main1{
	public static void main(String args[]){
	cake c=new cake();
	launch l=new launch();
	dinner dn=new dinner();
	}
}