package ds;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "a2a1b3c2a2b3";

		String[] arr = str.split("");

		String result = "";
		String prev = "";

		for (int i = 0; i < arr.length; i++) {

			if (i%2 == 0 && i < arr.length) {
				prev = arr[i];
			}
			int count=0;

			if (i > 0 && i % 2 == 1 && i < arr.length) {
				Integer value = Integer.valueOf(arr[i]);

				while (count < value) {
					result += prev;
					count++;
				}
			}

		}
		System.out.println(result);

	}
}
