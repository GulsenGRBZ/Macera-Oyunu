
public class Inventory {
	private boolean su ,yiyecek,yakacakodun;
	private String silahAd�,Z�rhAd�;
	private int z�rh,hasar;
	Inventory(){
		this.setSu(false);
		this.setYiyecek(false);
		this.setYakacakodun(false);
		this.setHasar(0);
		this.setZ�rh(0);
		this.setSilahAd�(null);
		this.setZ�rhAd�(null);
	}
	public boolean isSu() {
		return su;
	}
	public void setSu(boolean su) {
		this.su = su;
	}
	public boolean isYakacakodun() {
		return yakacakodun;
	}
	public void setYakacakodun(boolean yakacakodun) {
		this.yakacakodun = yakacakodun;
	}
	public boolean isYiyecek() {
		return yiyecek;
	}
	public void setYiyecek(boolean yiyecek) {
		this.yiyecek = yiyecek;
	}
	public String getSilahAd�() {
		return silahAd�;
	}
	public void setSilahAd�(String silahAd�) {
		this.silahAd� = silahAd�;
	}
	public String getZ�rhAd�() {
		return Z�rhAd�;
	}
	public void setZ�rhAd�(String z�rhAd�) {
		Z�rhAd� = z�rhAd�;
	}
	public int getZ�rh() {
		return z�rh;
	}
	public void setZ�rh(int z�rh) {
		this.z�rh = z�rh;
	}
	public int getHasar() {
		return hasar;
	}
	public void setHasar(int hasar) {
		this.hasar = hasar;
	}
	

}
