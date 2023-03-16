package privateSectorOperationsAutomationProject;

import java.util.ArrayList;

public class Admin {
	
//	Methods
	public void generateSalarySlip( Employee[] employees, float[] salaryFactor ) {
		for( int i = 0, j = 0; i < employees.length && j < salaryFactor.length; i++,j++ ) {
			employees[i].calculateSalary(salaryFactor[j]);
		}
	}
	
	public int generateAssetsReport( Employee[] employees, String lastDate ) {
		try {
			int totalNoOfAllocatedAsset = 0;
			for( Employee employee : employees ) {
				if(employee instanceof PermanentEmployee) {
					Asset[] assetsByDate =  ((PermanentEmployee) employee).getAssetsByDate(lastDate);
					totalNoOfAllocatedAsset += assetsByDate.length;
				}
			}
			return totalNoOfAllocatedAsset;
		} catch( InvalidAssetsException e ) {
			return -1;
		}
	}
	
	public String[] generateAssetsReport( Employee[] employees, char assetCategory ) {
		ArrayList<String> list = new ArrayList<String>();
		for( Employee employee : employees ) {
			if(employee instanceof PermanentEmployee) {
				Asset[] assets = ((PermanentEmployee) employee).getAssets();
				for( Asset asset : assets ) {
					if( asset.getAssetId().charAt(0) == assetCategory ) {
						list.add(asset.getAssetId());
					}
				}
			}
		}
		String[] totalAssets = new String[list.size()];
		totalAssets = list.toArray(totalAssets);
		return totalAssets;
	}
	
}