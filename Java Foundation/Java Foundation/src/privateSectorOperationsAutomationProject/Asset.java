package privateSectorOperationsAutomationProject;

public class Asset {
	
//	Instance Variables
	private String assetId;
	private String assetName;
	private String assetExpiry;
	
//	Constructor
	public Asset( String assetId, String assetName, String assetExpiry ) {
		this.assetId = assetId;
		this.assetExpiry = assetExpiry;
		this.assetName = assetName;
	}
	
//	Methods
	@Override
	public String toString() {
		return "Asset Id: "+getAssetId()+", Asset Name: "+getAssetName()+", Asset Expiry: "+getAssetExpiry();
	}

//	Getters and Setters
	public String getAssetId() {
		return assetId;
	}
	public void setAssetId(String assetId) {
		String regex = "(DSK|LTP|IPH)-([0-9]{6})([H]|[L])";
		if( assetId.matches(regex) ) {
			this.assetId = assetId;
		}
	}
	public String getAssetName() {
		return assetName;
	}
	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}
	public String getAssetExpiry() {
		return assetExpiry;
	}
	public void setAssetExpiry(String assetExpiry) {
		this.assetExpiry = assetExpiry;
	}
}
	
	
	