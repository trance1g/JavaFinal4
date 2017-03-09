import java.io.IOException;

public class FileArrayLauncher {

	public static void main(String[] args) throws IOException{
		//instantiate filearray class
		//and two arrays with values
		FileArray fileArray = new FileArray();
		int[] firstArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] secondArray = new int[10];
		
		//get input
		System.out.print("Contents of first array: ");
		printArray(firstArray);
		System.out.println("\nWriting");
		FileArray.writeArray("array.bin", firstArray);
		System.out.println("Reading");
		FileArray.readArray("array.bin", secondArray);
		System.out.print("Second array: ");
		printArray(secondArray);
	}
	
	public static void printArray(int[] array)
	{
		//for loop to display all of the contents of the array
		for(int index = 0; index < array.length; index++)
		{
			System.out.print(array[index]);
		}
	}
	}