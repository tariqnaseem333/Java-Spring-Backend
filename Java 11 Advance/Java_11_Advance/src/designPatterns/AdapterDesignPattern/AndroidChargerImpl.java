package designPatterns.AdapterDesignPattern;

public class AndroidChargerImpl implements AndroidCharger {

	@Override
	public void chargePhone() {
		System.out.println("Android phone is charging...");
	}

}
