package ua.lviv.lgs;

public class Main {

	public static void main(String[] args) {
		Robot r = new Robot("� Robot � � ������ ������");
		r.work();
		CoffeRobot cr = new CoffeRobot("� CoffeRobot � � ���� ����");
		cr.work();
		RobotDancer rd = new RobotDancer("� RobotDancer � � ������ ������");
		rd.work();
		RobotCoocker rc = new RobotCoocker("� RobotCoocker � � ������ �����");
		rc.work();
		
		Robot[] arrayRobot = {r, cr, rd, rc};
		for(int i = 0; i<arrayRobot.length; i++) {
			arrayRobot[i].work();
		}
		
	}

}
