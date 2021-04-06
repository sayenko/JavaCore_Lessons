package ua.lviv.lgs;

public class Main {

	public static void main(String[] args) {
		Robot r = new Robot("я Robot Ц € просто працюю");
		r.work();
		CoffeRobot cr = new CoffeRobot("я CoffeRobot Ц € варю каву");
		cr.work();
		RobotDancer rd = new RobotDancer("я RobotDancer Ц € просто танцюю");
		rd.work();
		RobotCoocker rc = new RobotCoocker("я RobotCoocker Ц € просто готую");
		rc.work();
		
		Robot[] arrayRobot = {r, cr, rd, rc};
		for(int i = 0; i<arrayRobot.length; i++) {
			arrayRobot[i].work();
		}
		
	}

}
