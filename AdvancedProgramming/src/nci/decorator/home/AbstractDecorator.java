package nci.decorator.home;

public abstract class AbstractDecorator extends Component {
	protected Component component;
	
	public void setTheComponent(Component c) {
		component = c;
	}
	
	/*
	public void makeHouse() {
		if(component != null) {
			component.makeHouse(); //delegating the task
		}
	}
	*/
	
}
