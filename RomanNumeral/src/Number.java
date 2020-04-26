
public class Number {
	private final static int[] arabic = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
	private final static String[] numeral = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
	

	
	public static String convertToRomanNumeral(int number) {
		
		if(number == 0) {
			return "zero";
		}
		
		StringBuffer sb = new StringBuffer();
		int write, remaining;
		
	
		remaining = number;
		
		
		for(int i = (arabic.length -1); i >=0; i--) {
			write = remaining/arabic[i];
			remaining = remaining - (write*arabic[i]);
			
			if(write > 0) {
				if(arabic[i] == 1 || arabic[i] == 100 || arabic[i] == 1000) {
					for(int j = 1; j<= write; j++) {
						sb.append(numeral[i]);
					}
				}else {
					sb.append(numeral[i]);
				}
			}	
		}
		
		return sb.toString();
		
/*Keeping the code below to document the trend observed	
 	
		write = value/90;
		remaining = value - (write*90);
		
		if(write > 0) {
			sb.append("XC");
		}
		
		
		write = remaining/50;
		remaining = remaining - (write*50);
		
		
		if(write > 0) {
			sb.append("L");
		}
		
		
		
		//logic for 40 - 49
		write = remaining/40;
		remaining = remaining -(write*40);

		
		if (write > 0) {
			sb.append("XL");
		}

		
		//logic for 10 - 39
		write = remaining / 10;
		remaining = remaining - (write*10);

		
		if(write > 0) {
			for(int i = 1; i<= write; i++) {
				sb.append("X");
			}
		}


		//logic for 9
		write = remaining/9;
		remaining = remaining - (write*9);

		
		if(write == 1) {
			sb.append("IX");
		}

		
		//logic for 6 - 8
		write = remaining/5;
		remaining = remaining - (write*5);

		
		if(write == 1) {
			sb.append("V");
		}

		
		//logic for 4
		write = remaining/4;
		remaining = remaining - (write*4);

		
		if(write > 0) {
			sb.append("IV");
		}

		
		//logic for 1 - 3
		write = remaining;
		remaining = 0;
		
		for(int i = 1; i<= write; i++) {
				sb.append("I");
		}
*/
		
	}
}
