import java.util.ArrayList;

public class Guidewire {
	public static void main(String[] args) {
			
		int num = Character.getNumericValue('1');
		
		System.out.println("num : " + num);
		String numString = String.valueOf(num);
		
		String numString2 = ((Integer)num).toString();
		
		
		char[] charArray = "abc".toCharArray();
		
		String[] stringArray = "abc".split("");
		
		
		System.out.println(InsertArray.insertNum(-666,5));
		
		
	}
}



class InsertArray{
	public static int insertNum(int originalNum, int num) {
		
		if(originalNum < 0)
			 num = -num;
		
		
		ArrayList<Integer> arr = new ArrayList<>();
			
		int temp = originalNum;
		
		while(temp != 0) {
			arr.add(temp%10);
			temp = temp/10;
		}
		
		System.out.println(arr);
		
		
		int sum = originalNum*10 + (num);
		
		for(int i = 0; i<=arr.size(); i++) {
			arr.add(i,num);
			
			int tempSum = 0;
			for(int j = arr.size() - 1;j>=0;j--) {
				tempSum = (tempSum*10) + arr.get(j);
			}

			if(tempSum>sum) {
				sum = tempSum;
			}
						
			arr.remove(i);
		}
		
		
		return sum;
		
	}
}