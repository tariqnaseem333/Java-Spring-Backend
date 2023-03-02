package interfaceClass;

public class SmartPhone extends Mobile implements Testable {

	//	Instance Variable
	private String networkGeneration;

	//	Constructor
	public SmartPhone( String name, String brand, String operatingSystemName, 
			String operatingSystemVersion, String networkGeneration ) {
		super( name, brand, operatingSystemName, operatingSystemVersion );
		this.networkGeneration =networkGeneration;
	}

	//	Method
	public boolean testCompatibility() {
		boolean isCompatible = false;
		if( super.getOperatingSystemName().equals("Saturn") ) {
			if( this.networkGeneration.equals("3G") ) {
				if( super.getOperatingSystemVersion().equals("1.1") || 
						super.getOperatingSystemVersion().equals("1.2")	|| 
						super.getOperatingSystemVersion().equals("1.3") ) {
					isCompatible = true;
				}
			}
			else if( this.networkGeneration.equals("4G") ) {
				if( super.getOperatingSystemVersion().equals("1.2")	|| 
						super.getOperatingSystemVersion().equals("1.3") ) {
					isCompatible = true;
				}
			}
			else if( this.networkGeneration.equals("5G") ) {
				if( super.getOperatingSystemVersion().equals("1.3") ) {
					isCompatible = true;
				}
			}
		}
		else if( super.getOperatingSystemName().equals("Gara") ) {
			if( this.networkGeneration.equals("3G") ) {
				if( super.getOperatingSystemVersion().equals("EXRT.1") || 
						super.getOperatingSystemVersion().equals("EXRT.2")	|| 
						super.getOperatingSystemVersion().equals("EXRU.1") ) {
					isCompatible = true;
				}
			}
			else if( this.networkGeneration.equals("4G") ) {
				if( super.getOperatingSystemVersion().equals("EXRT.2")	|| 
						super.getOperatingSystemVersion().equals("EXRU.1") ) {
					isCompatible = true;
				}
			}
			else if( this.networkGeneration.equals("5G") ) {
				if( super.getOperatingSystemVersion().equals("EXRU.1") ) {
					isCompatible = true;
				}
			}
		}
		return isCompatible;
	}

	//	Getters and Setters
	public String getNetworkGeneration() {
		return networkGeneration;
	}
	public void setNetworkGeneration(String networkGeneration) {
		this.networkGeneration = networkGeneration;
	}


}
