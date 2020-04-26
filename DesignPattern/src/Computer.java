
public abstract class Computer {
	protected double ram;
	protected double cpu;
	protected double hdd;
	
	public abstract void setCharacteristics();
	
	protected void getRAM() {
		System.out.println("RAM: " + ram);
	}
	
	protected void getCPU() {
		System.out.println("CPU: " + cpu);
	
	}
	
	protected void getHDD() {
		System.out.println("HDD " + hdd);
	}
	
	
}
