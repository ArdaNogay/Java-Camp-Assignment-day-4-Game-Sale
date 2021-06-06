package Managers;
import Entities.Campaign;
import Interfaces.CampaignService;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("'"+campaign.getCampaignName()+"'"+" adlý kampanya giriþi baþarýlý. Ýndirim oranýnýz : %"+campaign.getDiscountRate());

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("'"+campaign.getCampaignName()+"'"+" kampanyasý iptal edildi.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("'"+campaign.getCampaignName()+"'"+" kampanyasý güncellendi.");
	}


}
