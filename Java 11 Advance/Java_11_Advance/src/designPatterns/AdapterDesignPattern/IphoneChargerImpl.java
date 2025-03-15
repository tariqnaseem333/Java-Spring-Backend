package designPatterns.AdapterDesignPattern;

public class IphoneChargerImpl implements IphoneCharger{

	@Override
	public void chargePhone() {
		System.out.println("Iphone is charging...");
	}

}
