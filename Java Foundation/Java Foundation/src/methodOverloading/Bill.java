package methodOverloading;

public class Bill {
	
//	Methods
	public double findPrice( int itemId ) {
		double price = 0;
		if( itemId == 1001 ) {
			price = 25;
		} else if( itemId == 1002 ) {
			price = 20;
		} else if( itemId == 1003 ) {
			price = 23;
		} else if( itemId == 1004 ) {
			price = 18;
		}
		return price;
	}
	
	public double findPrice( String brandName, String itemType, int size ) {
		double price = 0;
		if( brandName.equals("Puma") ) {
			if( itemType.equals("T-shirt") ) {
				if( size == 34 || size == 36 ) {
					price = 25;
				}
			} else if( itemType.equals("Skirt") ) {
				if( size == 38 || size == 40 ) {
					price = 20;
				}
			}
		} 
		else if( brandName.equals("Reebok") ) {
			if( itemType.equals("T-shirt") ) {
				if( size == 34 || size == 36 ) {
					price = 23;
				}
			} else if( itemType.equals("Skirt") ) {
				if( size == 38 || size == 40 ) {
					price = 18;
				}
			}
		}
		return price;
	}

}
