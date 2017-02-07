
public class Shots implements IRobotCommand {

	private IRobotCommand component;
	private String option = "";

	public Shots(IRobotCommand c) {
		this.component = c;
	}

	public String getCommand() {
		if (option.isEmpty()) {//check option is empty or not
			return component.getCommand();//return command of next component if option is null
		}

		return "Shots[" + option + "] " + component.getCommand();//return Decaf[option ] and command of next component
	}

	public void setOption(String o) {
		option = o;

	}

	public void setComponent(IRobotCommand component) {
		// TODO Auto-generated method stub
		this.component = component;
	}

}
