import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileArray {

	public static void readArray(String fileName, int[] array) throws IOException
	{
		//method used to read the array, index by index
		FileInputStream fis = new FileInputStream(fileName);
		DataInputStream dis = new DataInputStream(fis);
		
		for(int index = 0; index < array.length; index++)
		{
			array[index] = dis.readInt();
		}
		
		dis.close();
	}
	
	public static void writeArray(String fileName, int[] array) throws IOException
	{
		//method used to write the array, index by index
		FileOutputStream fstream = new FileOutputStream(fileName);
		DataOutputStream outputFile = new DataOutputStream(fstream);
		
		for(int index = 0; index < array.length; index++)
		{
			outputFile.writeInt(array[index]);
		}
		
		outputFile.close();
	}
	
	
	
	

}






