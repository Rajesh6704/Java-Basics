import java.lang.*;
import java.util.*;

public class ReadKeyboard
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		String name;
		System.out.println("May I Know your Name");
		name = s.nextLine();
		System.out.println("Welcome Mr/Miss" + " " + name);
	}
}