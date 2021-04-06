package ua.lviv.lgs;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.time.*;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {
		//minimum
		getAnnotation(Animal.class);
		//maximum
		System.out.println(DateToLocalDate(new Date()));
		System.out.println(DateToLocalTime(new Date()));
		System.out.println(DateToLocalDateTime(new Date()));
	}

	public static void getAnnotation(Class<?> customClass) throws Exception {		
		Field[] fields = customClass.getDeclaredFields();
		StringBuilder data = new StringBuilder();
		File file = new File("Animal.txt");
		
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];			
			if(field.getAnnotation(Annotation.class) instanceof Annotation) {
				data.append(Modifier.toString(field.getModifiers()) + " "
						 	+ field.getType().getSimpleName() + " "
						 	+ field.getName() + "\n");
			}
		}
		writeFields(file, data.toString());
	}
	
	public static LocalDate DateToLocalDate(Date date) {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}
	
	public static LocalTime DateToLocalTime(Date date) {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
	}
	
	public static LocalDateTime DateToLocalDateTime(Date date) {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
	}
	
	
	private static void writeFields(File file, String data) throws Exception {		
		Writer wr = new FileWriter(file);
		wr.write(data);
		wr.close();		
	}
	
	
}
