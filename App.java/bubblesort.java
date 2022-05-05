import java.lang.reflect.Array;

class Bubsort {
	void bubsort(int arr[])
	{
		int n = array.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	void printArray(int arr[])
	{
		int n = array.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[])
	{
		Bubsort ob = new Bubsort();
		int arr[] = { 69, 28, 20, 11, 22, 9, 90 };
		ob.bubsort(arr);
		System.out.println("sorted array");
		ob.printArray(Array);
	}
}
