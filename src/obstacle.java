import java.util.Random;

public class obstacle {
	private String ad�;
	private int hasar ,�d�lpara,sagl�k,maxsay�s�;
	
	public obstacle(String ad�, int hasar,int sagl�k, int �d�lpara, int maxsay�s�) {
		super();
		this.ad� = ad�;
		this.hasar = hasar;
		this.sagl�k = sagl�k;
		this.�d�lpara = �d�lpara;
		this.maxsay�s� = maxsay�s�;
	}
	public int CanavarSay�s�() {
		Random rd = new Random();
		return rd.nextInt(this.maxsay�s�)+1;
		
	}
	public String getAd�() {
		return ad�;
	}
	public void setAd�(String ad�) {
		this.ad� = ad�;
	}
	public int getHasar() {
		return hasar;
	}
	public void setHasar(int hasar) {
		this.hasar = hasar;
	}
	public int get�d�lpara() {
		return �d�lpara;
	}
	public void set�d�lpara(int �d�lpara) {
		this.�d�lpara = �d�lpara;
	}
	public int getSagl�k() {
		return sagl�k;
	}
	public void setSagl�k(int sagl�k) {
		this.sagl�k = sagl�k;
	}
	public int getMaxsay�s�() {
		return maxsay�s�;
	}
	public void setMaxsay�s�(int maxsay�s�) {
		this.maxsay�s� = maxsay�s�;
	}
	
	

}
