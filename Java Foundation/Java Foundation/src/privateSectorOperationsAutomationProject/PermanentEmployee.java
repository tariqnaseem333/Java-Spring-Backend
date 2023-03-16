package privateSectorOperationsAutomationProject;

import java.util.ArrayList;

public class PermanentEmployee extends Employee {
	
//	Instance Variables
	private double basicPay;
	private String[] salaryComponents;
	private float experience;
	private Asset[] assets;
	
//	Constructor
	public PermanentEmployee( String employeeName, double basicPay, String[] salaryComponents, Asset[] assets ) {
		super( employeeName );
		this.basicPay = basicPay;
		this.salaryComponents = salaryComponents;
		this.assets = assets;
		this.setPermanentIdCounter(this.getPermanentIdCounter() + 1);
		this.setEmployeeId("E" + this.getPermanentIdCounter());
	}
	
//	Methods
	public double calculateBonus( float experience )throws InvalidExperienceException {
			double bonus = 0;
			if( this.experience >= 2.5F && this.experience < 4F ) {
				bonus = 2550;
				return bonus;
			}
			else if( this.experience >= 4F && this.experience < 8F ) {
				bonus = 5000;
				return bonus;
			}
			else if( this.experience >= 8F && this.experience < 12F ) {
				bonus = 8750;
				return bonus;
			}
			else if( this.experience >= 12F ) {
				bonus = 13000;
				return bonus;
			}
			else {
				throw new InvalidExperienceException("A minimum of 2.5 years is required for bonus!");
			}

	}
	
	public void calculateSalary( float experience ) {
		this.experience = experience;
		double salary = this.basicPay;
		double bonus = 0;
		for( String component : this.salaryComponents ) {
			component = component.replaceAll("[^\\d]", "");
			int components = Integer.parseInt(component);
			salary = salary + (components/100)*this.basicPay;
			
		}
		try {
			bonus = this.calculateBonus(experience);
		} catch( InvalidExperienceException e ) {
			e.getMessage();
		}
		salary = salary + bonus;
		this.setSalary(Math.round(salary));
	}
	
	public Asset[] getAssetsByDate( String lastDate )throws InvalidAssetsException {
		String lastMonth = lastDate.replaceAll("([\\d\\-]+)","");
		int lastMonthNumber = Resources.getMonth(lastMonth);
		int lastYear = Integer.parseInt(lastDate.substring(0, 4));
		int lastDay = Integer.parseInt(lastDate.substring(9));
		ArrayList<Asset> list = new ArrayList<Asset>();
		for( Asset asset : assets ) {
			String assetDate = asset.getAssetExpiry();
			int assetMonthNumber = Resources.getMonth(assetDate);
			int assetYear = Integer.parseInt(assetDate.substring(0, 4));
			int assetDay = Integer.parseInt(assetDate.substring(9));
			if( assetYear <= lastYear ) {
				if( assetMonthNumber <= lastMonthNumber ) {
					if( assetDay <= lastDay ) {
				        list.add(asset);
					}
				}
			} else {
				throw new InvalidAssetsException("No assets found for the given criteria!");
			}
		}
		Asset[] assetByDate = new Asset[list.size()];
		assetByDate = list.toArray(assetByDate);
		return assetByDate;
	}
	
	@Override
	public String toString() {
		return "Employee Id: "+getEmployeeId()+", Employee Name: "+getEmployeeName()+", Basic Pay: "+getBasicPay()+", Salary Components: "+getSalaryComponents()+", Assets: "+getAssets();
	}
	
//	Getters and Setters
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public String[] getSalaryComponents() {
		return salaryComponents;
	}
	public void setSalaryComponents(String[] salaryComponents) {
		this.salaryComponents = salaryComponents;
	}
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
	public Asset[] getAssets() {
		return assets;
	}
	public void setAssets(Asset[] assets) {
		this.assets = assets;
	}
}