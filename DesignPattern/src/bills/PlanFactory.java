package bills;

public class PlanFactory {

	public Plan getPlan(String plan) {
		if(plan.equalsIgnoreCase("commercial")) {
			return new Commercial();
		}else if(plan.equalsIgnoreCase("domestic")) {
			return new Domestic();
		}else if(plan.equalsIgnoreCase("institutional")) {
			return new Institutional();
		}else {
			return null;
		}
	}
}
