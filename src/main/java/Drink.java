public class Drink implements IRobotCommand {

	private IRobotCommand component;
	private String option="";

	public Drink(IRobotCommand c) {
		this.component = c;
	}

	public String getCommand() {
		if (option.isEmpty()) {
			return "";//return empty if option is empty
		}

		return "Drink[" + option + "]";//return Drink[option] if option have value
	}

	public void setOption(String o) {
		option = o;

	}

	public void setComponent(IRobotCommand component) {
		// TODO Auto-generated method stub
		this.component = component;
	}
}
