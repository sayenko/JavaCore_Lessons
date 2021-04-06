package ua.lviv.lgs;

public class Task_1 {
public static void main(String[] args) {
		
		//1.
		boolean bool = true;
		byte b = 26;
		char c = 156;
		short s = 6547;
		int i = 16579;
		long l = 605445L;
		float f = 6544.358F;
		double d = 644.487;
		
		//2.
		System.out.println("Boolean: FALSE = " + Boolean.FALSE + ", TRUE = " + Boolean.TRUE);
		System.out.println("Byte: MIN = " + Byte.MIN_VALUE + ", MAX = " + Byte.MAX_VALUE);
		System.out.print("Character: MIN = '" + Character.MIN_VALUE + "', MAX = '" + Character.MAX_VALUE + "' or ");
		System.out.println("Character: MIN = " + Integer.valueOf(Character.MIN_VALUE) + ", MAX = " + Integer.valueOf(Character.MAX_VALUE));
		System.out.println("Short: MIN = " + Short.MIN_VALUE + ", MAX = " + Short.MAX_VALUE);
		System.out.println("Integer: MIN = " + Integer.MIN_VALUE + ", MAX = " + Integer.MAX_VALUE);
		System.out.println("Long: MIN = " + Long.MIN_VALUE + ", MAX = " + Long.MAX_VALUE);
		System.out.println("Float: MIN = " + Float.MIN_VALUE + ", MAX = " + Float.MAX_VALUE);
		System.out.println("Double: MIN = " + Double.MIN_VALUE + ", MAX = " + Double.MAX_VALUE);
		
		//3.
		int[] array = {417, 51, 6, 115, 2, 85, 9, 735, 24, 8};
		Integer max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
			for (int j = 0; j < array.length; j++) {
				
				if(array[j] > max) {
					max = array[j];
				} else if (array[j] < min) {
					min = array[j];
				}
			}

		System.out.println("Min value of array: " + min);
		System.out.println("Max value of array: " + max);
	}
}
