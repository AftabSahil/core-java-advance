package app4;

import java.io.Closeable;
import java.io.IOException;
class R implements Closeable
{
	@Override
	public void close() throws IOException {
		System.out.println("i amfrom close");
	}
	public void use()
	{
		System.out.println("use");
	}
}
public class M67 {
	public static void main(String[] args) {
		try(R r1 = new R(); R r2 = new R(); R r3 = new R())
		{
			r1.use();
			r2.use();
			r3.use();
			System.out.println("end of try");
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			System.out.println("from finally");
		}
	}
}












