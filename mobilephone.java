package week1day2;

public class mobilephone {
	public void SendMessage()
	{
		System.out.println("call");
	}
public void call()
{
	System.out.println("send message");
}
public void sharedocument()
{
	System.out.println("Share picture");
}
public static void main(String[] args)
{
	mobilephone act=new mobilephone();
	act.SendMessage();
	act.call();
	act.sharedocument();
}
	
}
