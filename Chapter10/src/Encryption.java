import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Encryption {
	//creating a constructor
	public Encryption() throws IOException {
		writeArray();
	}

	//writearray method that uses fileoutput and dataoutput to write to the file
	public static void writeArray() throws IOException
	{
		FileOutputStream fstream = new FileOutputStream("Encryption.dat");
		DataOutputStream outputFile = new DataOutputStream(fstream);
		//displaying the encrypted info
	outputFile.writeUTF("This******is******encrypted");
		
		outputFile.close();
	}
}
