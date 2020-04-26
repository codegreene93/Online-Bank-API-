package nci.observer.example1;

import java.util.ArrayList;
import java.util.List;

public class Subject implements SubjectInterface{
	private int flag;
	
	
	public int getFlag() {
		return flag;	
	}
	
	
	public void setFlag(int flag) {
		//when the set flag changed, notify all registeredUsers(Observer)
		this.flag = flag;
		notifyRegisteredUsers(flag);
	}
	
	
	List<Observer> observerList = new ArrayList<>();
	
	
	@Override
	public void register(Observer anObserver) {
		observerList.add(anObserver);
	}

	@Override
	public void unregister(Observer anObserver) {
		observerList.remove(anObserver);
	}

	@Override
	public void notifyRegisteredUsers(int updatedValue) {
		// TODO Auto-generated method stub
		for(Observer observer : observerList) {
			observer.update(updatedValue);
		}
	}

}
