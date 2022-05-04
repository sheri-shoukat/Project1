class InsertSort {
	void sort(int arr[])
	{
		int n = array.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = key;
		}
	}

	static void printArray(int arr[])
	{
		int n = array.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void main(String args[])
	{
		int arr[] = { 10, 15, 22, 4, 2 };

		InsertionSort ob = new InsertionSort();
		ob.sort(array);

		printArray(array);
	}
}
