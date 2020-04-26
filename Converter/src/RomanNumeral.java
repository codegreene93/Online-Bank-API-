import java.util.ArrayList;
import java.util.List;

public class RomanNumeral {
	private int decimal;
	private String roman;
	
	private List<Integer> decimals = new ArrayList<>() {
		{
			add(1);
			add(2);
			add(5);
			add(9);
			add(10);
			add(40);
			add(50);
			add(90);
			add(100);
			add(400);
			add(500);
			add(900);
			add(1000);
		}
	};
	
	private List<String> romans = new ArrayList<>() {
		{
			add("I");
			add("IV");
			add("V");
			add("IX");
			add("X");
			add("XL");
			add("L");
			add("XC");
			add("C");
			add("CD");
			add("D");
			add("XM");
			add("M");
		}
	};
	
	
	
	
	public String convertToDecimal(int decimal) {
		
		this.decimal = decimal;
		
		int write = decimal/1000;
		int remaining = decimal - (write*1000);
		
		String roman = "";
		
		
		if(write > 0) {
			for(int i = 0; i<write; i++) {
				roman = roman + "M";
			}
		}
		
		write = remaining/900;
		remaining = remaining - (write*900);
		
		
		if(write > 0) {
				roman = roman + "CM";
		}
		
		
		write = remaining/500;
		remaining = remaining - (write*500);
		
		
		if(write > 0) {
			roman = roman + "D";
		}
		
		write = remaining/400;
		remaining = remaining - (write*400);
		
		if(write > 0) {
			roman = roman + "CD";
		}
		
		write = remaining/100;
		remaining = remaining - (write*100);
		
		if(write > 0) {
			for(int i = 0; i<write; i++) {
				roman = roman + "C";
			}
		}
		
		write = remaining/90;
		remaining = remaining - (write*90);
		
		
		if(write > 0) {
				roman = roman + "XC";
		}
		
		
		write = remaining/50;
		remaining = remaining - (write*50);
		
		
		if(write > 0) {
			roman = roman + "L";
		}
		
		write = remaining/40;
		remaining = remaining - (write*40);
		
		if(write > 0) {
			roman = roman + "XL";
		}
		
		write = remaining/10;
		remaining = remaining - (write*10);
		
		if(write > 0) {
			for(int i = 0; i<write; i++) {
				roman = roman + "X";
			}
		}
		
		write = remaining/9;
		remaining = remaining - (write*9);
		
		
		if(write > 0) {
				roman = roman + "IX";
		}
		
		
		write = remaining/5;
		remaining = remaining - (write*5);
		
		
		if(write > 0) {
			roman = roman + "V";
		}
		
		write = remaining/4;
		remaining = remaining - (write*4);
		
		if(write > 0) {
			roman = roman + "IV";
		}
		
		
		write = remaining;
		remaining = 0;
		
		if(write > 0) {
			for(int i = 0; i<write; i++) {
				roman = roman + "I";
			}
		}
		
		
		
		return roman;
	}
	
	
	public String convertToRoman(int dec) {
		this.decimal = dec;
		
		int remaining = decimal;
		String roman = "";
		
		for (int i = (decimals.size() - 1); i>=0; i--) {
			
			int currentDecimal = decimals.get(i);
			
			int write = remaining/currentDecimal;
			remaining = remaining - (write*currentDecimal);
			
			
			if(write > 0) {
				if(currentDecimal == 1000 || currentDecimal == 100 || currentDecimal == 10 || currentDecimal == 1) {
					for(int j = 0; j<write; j++) {
						roman = roman + romans.get(i);
					}
				} else {
					roman = roman + romans.get(i);
				}
				
			}
		}
		
		return roman;
	}
	
	
	
	public int convertoDecimal(String roman) {
		this.roman = roman;
		int decimal = 0;
		
		
		int length = roman.length();
		
		for(int i= 0; i<length; i++) {
			char currentChar = roman.charAt(i);
			char nextChar = roman.charAt(i+1);
			
			int currentIndex = romans.indexOf(currentChar);
			int nextIndex = romans.indexOf(nextChar);
			
			if(nextIndex > currentIndex) {
				currentIndex = currentIndex + 1;
				i++;
			}
			
			decimal = decimal + decimals.get(currentIndex);
		}		
		
		return decimal;
	}
	
	
	
	
	
	
	
	
}
