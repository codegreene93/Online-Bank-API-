package inner_classes;

class Robot{
	
	private int id;
	
	
	public class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking.");
		}
	}
	
	
	public static class Battery{
		public void charge() {
			System.out.println("Battery charging...");
		}
	}
	
	
	
	public Robot(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("Startin robot " + id);
		
		
		Brain brain = new Brain();
		brain.think();
		
		final String name = "Robert";
		
		class Temp{
			public void doSomething() {
				System.out.println("ID id " + id);
			}
		}
	}
}



public class RobotApp {
	public static void main(String[] args) {
		Robot robot = new Robot(1);
		robot.start();
		
		//Robot.Brain brain = robot.new Brain();
		//brain.think();
		
		Robot.Battery battery = new Robot.Battery();
		battery.charge();
	}
}
