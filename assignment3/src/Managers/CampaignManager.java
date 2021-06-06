package Managers;
import Entities.Campaign;
import Interfaces.CampaignService;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("'"+campaign.getCampaignName()+"'"+" adl� kampanya giri�i ba�ar�l�. �ndirim oran�n�z : %"+campaign.getDiscountRate());

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("'"+campaign.getCampaignName()+"'"+" kampanyas� iptal edildi.");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("'"+campaign.getCampaignName()+"'"+" kampanyas� g�ncellendi.");
	}


}
