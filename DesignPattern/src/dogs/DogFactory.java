package dogs;

public class DogFactory {
	public Dog getDog(String dog) {
		if(dog.equalsIgnoreCase("poodle")) {
			return new Poodle();
		}else if(dog.equalsIgnoreCase("rottweiler")){
			return new Rottweiler();
		}else if(dog.equalsIgnoreCase("siberian husky")) {
			return new SiberianHusky();
		}else {
			return null;
		}
	}
}
