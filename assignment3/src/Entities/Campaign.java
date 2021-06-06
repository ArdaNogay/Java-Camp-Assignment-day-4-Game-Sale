package Entities;

public class Campaign{
	private String campaignName;
	private int discountRate;
	
	
	public Campaign(String campaignName, int discountRate) {
		this.campaignName = campaignName;
		this.discountRate = discountRate;
	}
	

	
	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	

}
