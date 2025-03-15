package designPatterns.AdapterDesignPattern;

public class Adapter implements IphoneCharger {
	
	private AndroidCharger androidCharger;

	public Adapter(AndroidCharger androidCharger) {
		this.androidCharger = androidCharger;
	}

	@Override
	public void chargePhone() {
		androidCharger.chargePhone();
		System.out.println("Phone is charging with adapter");
	}

}
