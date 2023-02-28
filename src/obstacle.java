import java.util.Random;

public class obstacle {
	private String adı;
	private int hasar ,ödülpara,saglık,maxsayısı;
	
	public obstacle(String adı, int hasar,int saglık, int ödülpara, int maxsayısı) {
		super();
		this.adı = adı;
		this.hasar = hasar;
		this.saglık = saglık;
		this.ödülpara = ödülpara;
		this.maxsayısı = maxsayısı;
	}
	public int CanavarSayısı() {
		Random rd = new Random();
		return rd.nextInt(this.maxsayısı)+1;
		
	}
	public String getAdı() {
		return adı;
	}
	public void setAdı(String adı) {
		this.adı = adı;
	}
	public int getHasar() {
		return hasar;
	}
	public void setHasar(int hasar) {
		this.hasar = hasar;
	}
	public int getÖdülpara() {
		return ödülpara;
	}
	public void setÖdülpara(int ödülpara) {
		this.ödülpara = ödülpara;
	}
	public int getSaglık() {
		return saglık;
	}
	public void setSaglık(int saglık) {
		this.saglık = saglık;
	}
	public int getMaxsayısı() {
		return maxsayısı;
	}
	public void setMaxsayısı(int maxsayısı) {
		this.maxsayısı = maxsayısı;
	}
	
	

}
