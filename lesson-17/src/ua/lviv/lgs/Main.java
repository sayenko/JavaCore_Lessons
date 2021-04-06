package ua.lviv.lgs;

public class Main {

	public static void main(String[] args) {
		Integer[] array = {1, 43, -2, 34, 9, 17, -82, 1, 6, 55, 77, -34};
		Collection collection = new Collection(array);
		
		System.out.println("Task 1");
		Iterator task1 = collection.createTask1();		
		while(task1.HasNext()) {
			System.out.println(task1.next());
		}
		
		System.out.println();
		
		System.out.println("Task 2");
		Iterator task2 = collection.createTask2();
		while(task2.HasNext()) {
			System.out.println(task2.next());
		}
		
		System.out.println();
		
		System.out.println("Task 3");
		Iterator task3 = collection.createTask3();
		while(task3.HasNext()) {
			task3.next();
		}
		
		System.out.println();
		
		System.out.println("Task 4");
		Iterator task4 = collection.createTask4();
		while(task4.HasNext()) {
			task4.next();
		}
		
		System.out.println();
		
		System.out.println("Task 5");
		Iterator task5 = Collection.createTask5();
		while(task5.HasNext()) {
			task5.next();
		}
	}

}
