package designPatterns.AdapterDesignPattern;

public class Tester {

	public static void main(String[] args) {
		
		AndroidCharger androidCharger = new	AndroidChargerImpl();
		IphoneCharger iphoneCharger = new Adapter(androidCharger);
		
		Iphone iphone = new Iphone(iphoneCharger);
		iphone.chargeIphone();
		
//		IphoneCharger iphoneCharger = new IphoneChargerImpl();
//		
//		Iphone iphone = new Iphone(iphoneCharger);
//		iphone.chargeIphone();

	}

}
