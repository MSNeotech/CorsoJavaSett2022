package srl.neotech.dto;

public class ProductionBudgetDTO {

	private String companyName;
	private String title;
	private String budget;
	

	public ProductionBudgetDTO(String companyName, String title, String budget) {
		super();
		this.companyName = companyName;
		this.title = title;
		this.budget = budget;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBudget() {
		return budget;
	}
	public void setBudget(String budget) {
		this.budget = budget;
	}
	
	
	
}
