package ds;

public class Decomp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "a2ab3c2a2b3";

		String[] arr = str.split("");

		String result = "";
		String prev = ""; 

		for (int i = 0; i < arr.length-1; i++) {

			if(i>0) {
				prev = arr[i-1];
			}
			int count=0;
			try {
				if(arr[i])
				Integer value = Integer.valueOf(arr[i]);
				
				while(count<value) {
					  result +=prev;

					count++;
				}

			} catch (Exception e) {
			  prev = arr[i];
		
			  result +=prev+1;
			}

		}
		System.out.println(result);

	}

}
