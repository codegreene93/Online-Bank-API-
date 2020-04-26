
public class ComputerFactory {
	public Computer getComputer(String str) {
		if(str.equalsIgnoreCase("desktop")) {
			return new Desktop();
		}else if(str.equalsIgnoreCase("workstation")) {
			return new Workstation();
		}else if(str.equalsIgnoreCase("server")) {
			return new Server();
		}else {
			return null;
		}
	}
}
