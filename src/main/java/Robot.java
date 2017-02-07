public class Robot implements IRobotCommand {
	IRobotCommand component;

	public Robot(IRobotCommand comm) {
		this.component = comm;
	}

	public String getCommand() {
		return "Robot: "+component.getCommand();//return command of next component
	}

	public void setOption(String o) {

	}

	public void setComponent(IRobotCommand component) {
		// TODO Auto-generated method stub
		this.component = component;
	}
}
