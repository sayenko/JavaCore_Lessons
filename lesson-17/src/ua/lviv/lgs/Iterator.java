package ua.lviv.lgs;

public interface Iterator {
	public boolean HasNext();
	public Number next();
}

class Collection {
	
	private static Number[] arr;
	
	Collection(Number[] arr){
		Collection.arr = arr;
	}
	
	private class Task1 implements Iterator{

		private int count = 0;
		
		@Override
		public boolean HasNext() {
			return count<arr.length;
		}

		@Override
		public Number next() {
			if(count%2==0) {
				arr[count] = 0;
			}
			return arr[count++];
		}
		
	}
	
	public Task1 createTask1() {
		return new Task1();
	}
	
	private class Task2 implements Iterator{
		int count = arr.length-1;

		@Override
		public boolean HasNext() {
			return count>=0;
		}

		@Override
		public Number next() {
			int i = count;
			count-=2;
			return arr[i];
		}		
	}
	
	public Task2 createTask2() {
		return new Task2();
	}
	
	public Iterator createTask3() {
		return new Iterator(){

			private int count = arr.length-1;
			
			@Override
			public boolean HasNext() {
				return count>=0;
			}

			@Override
			public Number next() {
				int i = count;
				count-=3;
				if(count%2==0) {
					System.out.println("arr[" + i + "] = " + arr[i]);
				}
				return arr[i];
			}
			
		};
	}
	
	public Iterator createTask4() {
		
		class Task4 implements Iterator{

			private int count = 0;
			
			@Override
			public boolean HasNext() {
				return count<arr.length;
			}

			@Override
			public Number next() {
				if(count%2==0) {
					arr[count] = (int)arr[count]-100;
					System.out.println("arr[" + count +"] = " + arr[count]);
				}
				int i = count;
				count+=5;
				return arr[i];
			}
			
		}
		return new Task4();
	}
	
	private static class Task5 implements Iterator{

		private int count = 0;
		
		@Override
		public boolean HasNext() {
			return count<arr.length;
		}

		@Override
		public Number next() {
			if((int)(arr[count])%2==0) {
				arr[count] = (int)(arr[count])+1;
				System.out.println("arr[" + count +"] = " + arr[count]);
			}
			int i = count;
			count+=2;
			return arr[i];
		}
		
	}
	
	public static Task5 createTask5() {
		return new Task5();
	}
	
}