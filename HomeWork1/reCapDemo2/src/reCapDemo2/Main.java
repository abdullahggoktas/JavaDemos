package reCapDemo2;

public class Main {

	public static void main(String[] args) {

		double[] myList = { 5.7, 1.3, 5.8, 4.5 };
		double total = 0;
		double max = myList[0];

		for (double number : myList) 
		{
			if (max < number) 
			{
				max = number;
			}

			total = total + number;
		}

		System.out.println("Toplam: " + total);
		System.out.println("En Büyük Sayı: " + max);

	}

}
