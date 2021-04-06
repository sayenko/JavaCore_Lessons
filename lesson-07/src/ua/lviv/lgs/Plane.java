package ua.lviv.lgs;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Plane {
	
	private int length;
	private int width;
	private int weight;
	
	public void startingEngines() {
		int timeToStart = (int)(20 + Math.random() * 68);
		System.out.println("�� ������� ���������� " + timeToStart + " ���");
	}
	
	public void takeOffPlane() {	
		double flightDistance = Math.random() * 1000;		
		BigDecimal result = new BigDecimal(flightDistance);
		result = result.setScale(2, RoundingMode.HALF_EVEN);
		System.out.println("������ ��������� �� " + result + " ��");
	}
	
	public void landingOfPlane() {
		System.out.println("˳��� ��� �� �������");
	}
	
	
}
