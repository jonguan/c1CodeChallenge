
public class iPhone {
	private Decaf decaf;
	private Shots shots;
	private Milk milk;
	private Drink drink;
	private IRobotCommand robot;

	public iPhone() {
		// creating the object of Decaf , Shot , Milk , Drink and IRobotCommand
		drink = new Drink(robot);
		milk = new Milk(drink);
		shots = new Shots(milk);
		decaf = new Decaf(shots);
		robot = new Robot(decaf);
	}

	public void setDecaf(String s) {
		// set the option to Decaf
		decaf.setOption(s);
		// input: NO, YES and 1/2
	}

	public void setShots(String s) {
		// set the option to Shots
		shots.setOption(s);
		// input: 1, 2, 3, d
	}

	public void setMilk(String s) {
		// set the option to Milk
		milk.setOption(s);
		// input: WH, NF, 1, 2
	}

	public void setDrink(String s) {
		// set the option to Drink
		drink.setOption(s);
		// input: A, L, M, C, CM, CDI, E, ECP
	}

	public String sendCommand() {
		// return command string for robot

		setCommand();// reset component to all IRobotCommand
		return robot.getCommand(); // replace with your code
	}

	private void setCommand() {
		// TODO Auto-generated method stub
		milk.setComponent(drink);
		shots.setComponent(milk);
		decaf.setComponent(shots);
		robot.setComponent(decaf);
	}
}
