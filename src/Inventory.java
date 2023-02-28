
public class Inventory {
	private boolean su ,yiyecek,yakacakodun;
	private String silahAdý,ZýrhAdý;
	private int zýrh,hasar;
	Inventory(){
		this.setSu(false);
		this.setYiyecek(false);
		this.setYakacakodun(false);
		this.setHasar(0);
		this.setZýrh(0);
		this.setSilahAdý(null);
		this.setZýrhAdý(null);
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
	public String getSilahAdý() {
		return silahAdý;
	}
	public void setSilahAdý(String silahAdý) {
		this.silahAdý = silahAdý;
	}
	public String getZýrhAdý() {
		return ZýrhAdý;
	}
	public void setZýrhAdý(String zýrhAdý) {
		ZýrhAdý = zýrhAdý;
	}
	public int getZýrh() {
		return zýrh;
	}
	public void setZýrh(int zýrh) {
		this.zýrh = zýrh;
	}
	public int getHasar() {
		return hasar;
	}
	public void setHasar(int hasar) {
		this.hasar = hasar;
	}
	

}
