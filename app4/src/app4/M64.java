package app4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class M64 {
	public static void main(String[] args) {
		FileReader fin = null;
		BufferedReader bin = null;
		try {
				File f1 = new File("D:\\feb-dev -lara\\core-java-advanced\\app4\\src\\app4\\M64.java");
				fin = new FileReader(f1);
				bin = new BufferedReader(fin);
				String s1 = bin.readLine();
				while (s1 != null)
				{
					System.out.println(s1);
					s1 = bin.readLine();
				}
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		finally {
			if(bin != null)
			{
				bin.close();
			}
			catch (IOException ex) 
			{
				ex.printStackTrace();
			}
		}
			if(fin != null)
			{
				fin.close();
			}
			catch (IOException ex) 
			{
				ex.printStackTrace();
			
				
			}
		}
	}
		
}

